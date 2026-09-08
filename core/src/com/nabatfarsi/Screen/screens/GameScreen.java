package com.nabatfarsi.Screen.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.nabatfarsi.Screen.game.GameController;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.nabatfarsi;


public class GameScreen implements Screen {
    //private static final Logger log = new Logger(GameScreen.class.getName(), Logger.DEBUG);

    private final nabatfarsi game;
    private final AssetManager assetManager;
    private GameController controller;
    private com.nabatfarsi.Screen.game.GameRenderer renderer;
    private final Music backgroundmusic;


    public GameScreen(nabatfarsi game) {

        this.game = game;
        assetManager = game.getAssetManager();
        backgroundmusic = assetManager.get(AssetDescriptors.BACKGROUND_MUSIC);
        backgroundmusic.setVolume(GameConfig.BACKGROUND_MUSIC_VOLUME);
        backgroundmusic.setLooping(true);
        backgroundmusic.play();




    }


    @Override
    public void show() {
//        log.debug("show");

        controller = new GameController(assetManager, game);
        renderer = new com.nabatfarsi.Screen.game.GameRenderer(assetManager, controller);

//        log.debug("Game screen");
    }

    @Override
    public void render(float delta) {
//        log.debug("render");

        controller.update(delta);

            renderer.render(delta);
            if (game.isNextLevelRequested()) {
                game.setNextLevelRequested(false);
                int gameLevel = controller.getGameLevel() + 1;
                game.setScreen(new LoadingScreen(game, gameLevel));
            } else if (game.isPreviousLevelRequested()) {
                game.setPreviousLevelRequested(false);
                int gameLevel = controller.getGameLevel() - 1;
                game.setScreen(new LoadingScreen(game, gameLevel));
            } else if (game.isMenueRequested()) {
                game.setScreen(new MenuScreen(game, assetManager, controller));
                game.setMenueRequested(false);
            }


    }


    @Override
    public void resize(int width, int height) {
//        log.debug("resize");

        renderer.resize(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
//        log.debug("hide");

        dispose();


    }

    @Override
    public void dispose() {
//        log.debug("dispose");
        renderer.dispose();

    }
}
