package com.nabatfarsi.gwt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.nabatfarsi.nabatfarsi;

public class GwtLauncher extends GwtApplication {

    @Override
    public GwtApplicationConfiguration getConfig() {
        // Resizable: fills the available browser viewport (minus padding) instead of a fixed
        // 1200x640 canvas. FitViewport(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT, ...) in
        // each Screen preserves the game's aspect ratio and letterboxes the rest.
        GwtApplicationConfiguration config = new GwtApplicationConfiguration();
        config.padHorizontal = 0;
        config.padVertical = 0;
        config.useGL30 = false;
        // Gdx.net.openURI("/") (used by the in-game exit button to return to the landing
        // page) should navigate in this tab, not pop a new one.
        config.openURLInNewWindow = false;
        return config;
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new nabatfarsi();
    }
}
