package com.nabatfarsi;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.utils.Logger;
import com.nabatfarsi.Screen.screens.LoadingScreen;
import com.nabatfarsi.common.GameManager;
import com.nabatfarsi.config.GameConfig;

public class nabatfarsi extends Game {

    private AssetManager assetManager;
    private boolean nextLevelRequested;
    private boolean previousLevelRequested;
    private boolean menueRequested;
    private boolean updatemenueActorRequested;
    private int gameLevel = 0;

    public GameEventListener getGameEventListener() {
        return () -> {};  // No-op: no purchase in web version
    }

    public nabatfarsi() {
    }

    @Override
    public void create() {
        GameManager.INSTANCE.update_is_purchased(true);
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        GameManager.INSTANCE.update_current_Menu(0);
        assetManager = new AssetManager();
        assetManager.getLogger().setLevel(Logger.DEBUG);

        try {
            gameLevel = GameManager.INSTANCE.get_current_Level();
            GameManager.INSTANCE.update_previous_Level(gameLevel);
        } catch (Exception e) {
            gameLevel = GameConfig.LEVEL;
            GameManager.INSTANCE.update_previous_Level(gameLevel);

            e.printStackTrace();
        }

        setScreen(new LoadingScreen(this, gameLevel));
    }


    @Override
    public void dispose() {
        assetManager.dispose();
    }

    public AssetManager getAssetManager() {
        return assetManager;
    }

    public boolean isNextLevelRequested() {
        return nextLevelRequested;
    }

    public void setNextLevelRequested(boolean nextLevelRequested) {
        this.nextLevelRequested = nextLevelRequested;
    }

    public void setPreviousLevelRequested(boolean previousLevelRequested) {
        this.previousLevelRequested = previousLevelRequested;
    }

    public boolean isPreviousLevelRequested() {
        return previousLevelRequested;
    }

    public boolean isMenueRequested() {
        return menueRequested;
    }

    public void setMenueRequested(boolean menueRequested) {
        this.menueRequested = menueRequested;
    }

    public boolean isUpdatemenueActorRequested() {
        return updatemenueActorRequested;
    }

    public void setUpdatemenueActorRequested(boolean updatemenueActorRequested) {
        this.updatemenueActorRequested = updatemenueActorRequested;
    }

    public boolean ISPURCHASED() {
        return true;  // All content free in web version
    }
}
