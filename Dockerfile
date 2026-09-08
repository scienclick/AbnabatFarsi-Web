# Stage 1: build the GWT war
FROM gradle:7.6-jdk8 AS builder
WORKDIR /app
COPY . .
# Fix Windows line endings on the Gradle wrapper script
RUN sed -i 's/\r//' gradlew
RUN ./gradlew html:war --no-daemon

# Stage 2: serve static files with nginx
FROM nginx:1.25-alpine
COPY --from=builder /app/html/build/libs/html-1.0.war /tmp/app.war
RUN apk add --no-cache unzip \
    && unzip /tmp/app.war -d /usr/share/nginx/html \
    && rm /tmp/app.war
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
