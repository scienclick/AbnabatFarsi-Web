import os
import sqlite3
from datetime import datetime, timezone
from functools import wraps

from flask import Flask, request, jsonify, render_template_string, Response

app = Flask(__name__)

DB_PATH = os.environ.get("CONTACT_DB_PATH", "/data/messages.db")
ADMIN_USER = os.environ.get("CONTACT_ADMIN_USER", "admin")
ADMIN_PASSWORD = os.environ.get("CONTACT_ADMIN_PASSWORD")

if not ADMIN_PASSWORD:
    raise RuntimeError("CONTACT_ADMIN_PASSWORD environment variable must be set")


def get_db():
    conn = sqlite3.connect(DB_PATH)
    conn.execute(
        """
        CREATE TABLE IF NOT EXISTS messages (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            name TEXT NOT NULL,
            email TEXT NOT NULL,
            message TEXT NOT NULL,
            created_at TEXT NOT NULL
        )
        """
    )
    return conn


def require_auth(f):
    @wraps(f)
    def wrapped(*args, **kwargs):
        auth = request.authorization
        if not auth or auth.username != ADMIN_USER or auth.password != ADMIN_PASSWORD:
            return Response(
                "Authentication required",
                401,
                {"WWW-Authenticate": 'Basic realm="Contact Inbox"'},
            )
        return f(*args, **kwargs)

    return wrapped


@app.post("/submit")
def submit():
    data = request.get_json(silent=True) or request.form

    # Honeypot: a hidden field real visitors never fill in. Bots that blindly fill every
    # field will trip this and get a silent success with nothing stored.
    if (data.get("website") or "").strip():
        return jsonify({"ok": True})

    name = (data.get("name") or "").strip()
    email = (data.get("email") or "").strip()
    message = (data.get("message") or "").strip()

    if not name or not email or not message:
        return jsonify({"error": "name, email and message are required"}), 400
    if len(name) > 200 or len(email) > 200 or len(message) > 5000:
        return jsonify({"error": "input too long"}), 400

    conn = get_db()
    conn.execute(
        "INSERT INTO messages (name, email, message, created_at) VALUES (?, ?, ?, ?)",
        (name, email, message, datetime.now(timezone.utc).isoformat()),
    )
    conn.commit()
    conn.close()
    return jsonify({"ok": True})


@app.get("/admin")
@require_auth
def admin():
    conn = get_db()
    rows = conn.execute(
        "SELECT id, name, email, message, created_at FROM messages ORDER BY id DESC"
    ).fetchall()
    conn.close()
    return render_template_string(ADMIN_TEMPLATE, messages=rows)


@app.post("/admin/delete/<int:msg_id>")
@require_auth
def delete_message(msg_id):
    conn = get_db()
    conn.execute("DELETE FROM messages WHERE id = ?", (msg_id,))
    conn.commit()
    conn.close()
    return Response(status=303, headers={"Location": "/admin"})


@app.get("/health")
def health():
    return jsonify({"ok": True})


ADMIN_TEMPLATE = """
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Contact Inbox</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Vazirmatn:wght@400;600;700&display=swap" rel="stylesheet">
<style>
  body { font-family: 'Vazirmatn', system-ui, sans-serif; background: #f4f6f8; margin: 0; padding: 2rem; color: #1f2937; }
  h1 { margin: 0 0 1.5rem; font-size: 1.5rem; }
  .count { color: #6b7280; font-weight: normal; font-size: 1rem; }
  .msg { background: #fff; border-radius: 10px; box-shadow: 0 1px 3px rgba(0,0,0,0.08); padding: 1.25rem 1.5rem; margin-bottom: 1rem; }
  .msg-head { display: flex; justify-content: space-between; align-items: baseline; flex-wrap: wrap; gap: .5rem; }
  .msg-name { font-weight: 600; }
  .msg-email { color: #2563eb; margin-inline-start: .5rem; }
  .msg-time { color: #9ca3af; font-size: .85rem; }
  .msg-body { margin-top: .75rem; white-space: pre-wrap; line-height: 1.5; }
  .empty { color: #6b7280; text-align: center; padding: 3rem 0; }
  form.delete { margin: 0; }
  button.delete { background: none; border: none; color: #dc2626; cursor: pointer; font-size: .85rem; padding: 0; }
  button.delete:hover { text-decoration: underline; }
</style>
</head>
<body>
  <h1>Contact Inbox <span class="count">({{ messages|length }})</span></h1>
  {% if not messages %}
    <div class="empty">No messages yet.</div>
  {% endif %}
  {% for m in messages %}
    <div class="msg">
      <div class="msg-head">
        <div><span class="msg-name" dir="auto">{{ m[1] }}</span><span class="msg-email">{{ m[2] }}</span></div>
        <div class="msg-time">{{ m[4] }}</div>
      </div>
      <div class="msg-body" dir="auto">{{ m[3] }}</div>
      <form class="delete" method="post" action="/admin/delete/{{ m[0] }}" onsubmit="return confirm('Delete this message?');">
        <button class="delete" type="submit">Delete</button>
      </form>
    </div>
  {% endfor %}
</body>
</html>
"""

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
