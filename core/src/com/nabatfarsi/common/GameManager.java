package com.nabatfarsi.common;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.nabatfarsi.nabatfarsi;


/**
 * Created by AShamsa on 12/5/2017.
 */

public class GameManager
{
    public static final GameManager INSTANCE = new GameManager();

    private static final String LEVEL_CURRENT_KEY = "level_current";
    private static final String LEVEL_PREVIOUS_KEY = "level_previous";
    private static final String MENU_CURRENT_KEY = "menue_current";
    private static final String MENU_PREVIOUS_KEY = "menue_previous";
    private static final String REPLAY_REQUESTED_KEY = "replay_requested";
    private static final String ISPURCHASED_KEY = "is_purchased";

    private Preferences PREFS;

    private GameManager() {
        PREFS = Gdx.app.getPreferences(nabatfarsi.class.getSimpleName());
    }

    public void update_current_Level(int level) {
        PREFS.putInteger(LEVEL_CURRENT_KEY, level);
        PREFS.flush();
    }
    public void update_previous_Level(int level) {
        PREFS.putInteger(LEVEL_PREVIOUS_KEY, level);
        PREFS.flush();
    }

    public void update_previous_Menu(int level) {

        PREFS.putInteger(MENU_PREVIOUS_KEY, level);
        PREFS.flush();
    }
    public void update_current_Menu(int level) {

        PREFS.putInteger(MENU_CURRENT_KEY, level);
        PREFS.flush();
    }
    public void update_replay_requested(int code) {
        //0:no
        //1:yes

        PREFS.putInteger(REPLAY_REQUESTED_KEY, code);
        PREFS.flush();
    }
    public void update_is_purchased(boolean code) {


        PREFS.putBoolean(ISPURCHASED_KEY, code);
        PREFS.flush();
    }

    /*public String get_current_LevelString() {
        return String.valueOf(level_current);
    }
*/
    public int get_current_Level() {

        return PREFS.getInteger(LEVEL_CURRENT_KEY, 0);
    }
    public int get_previous_Level() {

        return PREFS.getInteger(LEVEL_PREVIOUS_KEY, 0);
    }
    public int getReplay_requested() {
        return PREFS.getInteger(REPLAY_REQUESTED_KEY, 0);
    }

    public int get_current_Menu() {
        return PREFS.getInteger(MENU_CURRENT_KEY, 0);
    }
    public int get_previous_Menu() {
        return PREFS.getInteger(MENU_PREVIOUS_KEY, 0);
    }
    public boolean get_IspurchasedKey() {
        return PREFS.getBoolean(ISPURCHASED_KEY,false);
    }
}
