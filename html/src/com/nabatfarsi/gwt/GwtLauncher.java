package com.nabatfarsi.gwt;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.nabatfarsi.nabatfarsi;

public class GwtLauncher extends GwtApplication {

    @Override
    public GwtApplicationConfiguration getConfig() {
        GwtApplicationConfiguration config = new GwtApplicationConfiguration(1200, 640);
        config.useGL30 = false;
        return config;
    }

    @Override
    public ApplicationListener createApplicationListener() {
        return new nabatfarsi();
    }
}
