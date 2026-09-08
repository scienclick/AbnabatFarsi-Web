package com.nabatfarsi.Screen.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.TextureAtlasLoader;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.ResolutionFileResolver;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.assets.RegionNames;
import com.nabatfarsi.common.GameManager;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.nabatfarsi;
import com.nabatfarsi.util.GdxUtils;

import java.util.Map;

import static com.nabatfarsi.config.GameConfig.CHICK_FRAME_NUM;
import static com.nabatfarsi.config.GameConfig.CHICK_HEIGHT;
import static com.nabatfarsi.config.GameConfig.CHICK_SPEED;
import static com.nabatfarsi.config.GameConfig.CHICK_Y;
import static com.nabatfarsi.config.GameConfig.CIRCLE_HEIGHT;
import static com.nabatfarsi.config.GameConfig.CIRCLE_X;
import static com.nabatfarsi.config.GameConfig.CIRCLE_Y;
import static com.nabatfarsi.util.staticMethods.StaticMethods.fillAssetMap;
import static com.nabatfarsi.util.staticMethods.StaticMethods.fillMUSICAssetMap;


/**
 * Created by AShamsa on 12/4/2017.
 */

public class LoadingScreen extends ScreenAdapter {
    private static final Logger log = new Logger(LoadingScreen.class.getName(), Logger.DEBUG);

    private OrthographicCamera camera;
    private Viewport viewport;
    private SpriteBatch batch;

    private final nabatfarsi game;
    private final AssetManager assetManager;
    Map<Integer, AssetDescriptor<TextureAtlas>> assetDescriptorMap;
    Map<Integer, AssetDescriptor<Music>[]> assetMUSICDescriptorMap;

    private TextureRegion bluBG;
    private TextureRegion Circle_BG;
    private TextureRegion[] Chick;
    private Texture bluBGt;
    private Texture Circle_BGt;
    private Texture[] lampt;
    float counter = 0;
    float counter3 = 0;

    int gameLevel = 0;
    boolean firstLoad;
    private boolean changeScreen;
    private float progress;

    private static TextureAtlas gamePlayAtlas;

    public LoadingScreen(nabatfarsi game, int level) {
        this.gameLevel = level;
        this.game = game;
        assetManager = game.getAssetManager();
        firstLoad = true;

        assetDescriptorMap = fillAssetMap();
        assetMUSICDescriptorMap = fillMUSICAssetMap();
        if (assetManager.isLoaded(AssetDescriptors.GAME_PLAY_LOADINGPAGE.fileName)) {
            gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_LOADINGPAGE);
            bluBG = gamePlayAtlas.findRegion(RegionNames.BG0_loading);
            Circle_BG = gamePlayAtlas.findRegion(RegionNames.BG_circle);
            Chick = new TextureRegion[]
                    {gamePlayAtlas.findRegion(RegionNames.J1),
                            gamePlayAtlas.findRegion(RegionNames.J2),
                            gamePlayAtlas.findRegion(RegionNames.J3),
                            gamePlayAtlas.findRegion(RegionNames.J4),
                            gamePlayAtlas.findRegion(RegionNames.J5),
                            gamePlayAtlas.findRegion(RegionNames.J6),
                    };
            firstLoad = false;
        } else {
            bluBGt = new Texture(Gdx.files.internal("raw/BG0_loading.png"));
            Circle_BGt = new Texture(Gdx.files.internal("raw/BG_circle.png"));
            lampt = new Texture[]
                    {new Texture(Gdx.files.internal("raw/L0.png")),
                            new Texture(Gdx.files.internal("raw/L1.png")),
                            new Texture(Gdx.files.internal("raw/L2.png")),
                            new Texture(Gdx.files.internal("raw/L3.png")),
                            new Texture(Gdx.files.internal("raw/L4.png")),
                            new Texture(Gdx.files.internal("raw/L5.png")),
                            new Texture(Gdx.files.internal("raw/L6.png")),
                            new Texture(Gdx.files.internal("raw/L7.png")),
                            new Texture(Gdx.files.internal("raw/L8.png")),
                            new Texture(Gdx.files.internal("raw/L9.png")),
                            new Texture(Gdx.files.internal("raw/L10.png")),
                            new Texture(Gdx.files.internal("raw/L11.png")),
                            new Texture(Gdx.files.internal("raw/L12.png")),
                            new Texture(Gdx.files.internal("raw/L13.png")),
                            new Texture(Gdx.files.internal("raw/L14.png")),

                    };
        }
    }

    @Override
    public void show() {
//        log.debug("show(): Loading Screen ");
        camera = new OrthographicCamera();
        viewport = new FitViewport(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT, camera);
        batch = new SpriteBatch();
        getLoadGeneralAssets();

        //in case that it is called from somewher other than the first page this might not get updated
        try {
            gameLevel = GameManager.INSTANCE.get_current_Level();
        } catch (Exception e) {
            gameLevel = GameConfig.LEVEL;
            ////e.printStackTrace();
        }

        EmptyAssetManagerfrompreviousLevel();
        ResolutionFileResolver.Resolution[] resolutions =
                {
                        //new ResolutionFileResolver.Resolution(281, 500, "small"),
                        new ResolutionFileResolver.Resolution(383, 680, "medium"),
                        //new ResolutionFileResolver.Resolution(563, 1000, "large")
                };

        ResolutionFileResolver resolver = new ResolutionFileResolver(new InternalFileHandleResolver(), resolutions);
        assetManager.setLoader(TextureAtlas.class, new TextureAtlasLoader(resolver));
        assetManager.load(assetDescriptorMap.get(gameLevel));
        int level = gameLevel ;
        for (AssetDescriptor<Music> assetDescriptor : assetMUSICDescriptorMap.get(level)
                ) {
            assetManager.load(assetDescriptor);
        }

    }


    @Override
    public void render(float delta) {
        update(delta);
        GdxUtils.clearScreen();

        viewport.apply();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        draw();
        batch.end();

        if (changeScreen) {
            if (firstLoad) {
                game.setMenueRequested(true);
            }
            game.setScreen(new GameScreen(game));
        }
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void hide() {
//        log.debug("hide");
        dispose();
    }

    @Override
    public void dispose() {
//        log.debug("dispose");
        batch.dispose();
        batch = null;
    }

    private void update(float delta) {
        // progress is between 0 and 1
        progress = assetManager.getProgress();
        // update returns true when all assets are loaded
        if (assetManager.update()) {
            changeScreen = true;
        }
    }

    private void draw() {
        if (!firstLoad) {
            //renderer.rect(0, 3, progress * GameConfig.WORLD_WIDTH, 1);
            batch.draw(bluBG, 0, 0, GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
            //batch.draw(texture1, 9, .1f, 0.5f*(float) texture1.getWidth()/ texture1.getHeight(), .5f);
            batch.draw(Circle_BG,
                    CIRCLE_X, CIRCLE_Y,                                       // x, y,
                    CIRCLE_HEIGHT / 2, CIRCLE_HEIGHT / 2,                    // originX, originY, half of the requiered height 0.5 in bellow if not changed
                    CIRCLE_HEIGHT * (float) Circle_BG.getRegionWidth() / Circle_BG.getRegionHeight(), CIRCLE_HEIGHT,     // World width, World height improtant
                    1f, 1f,                                 // scaleX, scaleY,
                    (progress) * 150                                      // rotation
            );


            counter += CHICK_SPEED;
            int counter2 = Math.round(counter);
            batch.draw(Chick[counter2 % CHICK_FRAME_NUM], progress * GameConfig.WORLD_WIDTH + .05f, CHICK_Y,
                    CHICK_HEIGHT * (float) Chick[counter2 % CHICK_FRAME_NUM].getRegionWidth() / Chick[counter2 % CHICK_FRAME_NUM].getRegionHeight(), CHICK_HEIGHT);


        } else {
            //renderer.rect(0, 3, progress * GameConfig.WORLD_WIDTH, 1);
            batch.draw(bluBGt, 0, 0, GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
            //batch.draw(texture1, 9, .1f, 0.5f*(float) texture1.getWidth()/ texture1.getHeight(), .5f);
            batch.draw(Circle_BGt,
                    CIRCLE_X, CIRCLE_Y,                                       // x, y,
                    CIRCLE_HEIGHT / 2, CIRCLE_HEIGHT / 2,                    // originX, originY, half of the requiered height 0.5 in bellow if not changed
                    CIRCLE_HEIGHT * (float) Circle_BGt.getWidth() / Circle_BGt.getHeight(), CIRCLE_HEIGHT,     // World width, World height improtant
                    1f, 1f,                                 // scaleX, scaleY,
                    (progress) * 150,                                       // rotation
                    0, 0,                                       // srcX, srcY
                    Circle_BGt.getWidth(), Circle_BGt.getHeight(),    // srcWidth, srcHeight
                    false, false                                // flipX, flipY
            );
            int Progressindex = Math.round(progress * 15);
            batch.draw(lampt[Progressindex], 0, 0, GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);

        }

        log.debug("*************************AssetNumbers loaded=" + assetManager.getLoadedAssets());

    }


    private void getLoadGeneralAssets() {
        if (!assetManager.isLoaded(AssetDescriptors.GAME_PLAY_GENERAL.fileName)) {
            ResolutionFileResolver.Resolution[] resolutions =
                    {
                            //new ResolutionFileResolver.Resolution(281, 500, "small"),
                            new ResolutionFileResolver.Resolution(383, 680, "medium"),
                            //new ResolutionFileResolver.Resolution(563, 1000, "large")
                    };

            ResolutionFileResolver resolver = new ResolutionFileResolver(new InternalFileHandleResolver(), resolutions);

            assetManager.setLoader(TextureAtlas.class, new TextureAtlasLoader(resolver));
            assetManager.load((AssetDescriptors.GAME_PLAY_LOADINGPAGE));
            assetManager.load((AssetDescriptors.GAME_PLAY_GENERAL));
            assetManager.load(AssetDescriptors.BACKGROUND_MUSIC);
            assetManager.load(AssetDescriptors.CHEER_MUSIC);
            assetManager.load(AssetDescriptors.CORRECT_MUSIC);
            assetManager.load(AssetDescriptors.INCORRECT_MUSIC);
            assetManager.load(AssetDescriptors.BALLOONPOP_MUSIC);


        }
    }

    private void EmptyAssetManagerfrompreviousLevel() {


        int flushLevel = GameManager.INSTANCE.get_previous_Level();
        if (assetManager.isLoaded(assetDescriptorMap.get(flushLevel).fileName)) {
            assetManager.unload(assetDescriptorMap.get(flushLevel).fileName);
        }

        try {
            if (assetManager.isLoaded(assetDescriptorMap.get(flushLevel-1).fileName)) {
                assetManager.unload(assetDescriptorMap.get(flushLevel-1).fileName);
            }
        } catch (Exception e) {
            ////e.printStackTrace();
        }
        for (AssetDescriptor<Music> assetDescriptor : assetMUSICDescriptorMap.get(flushLevel)
                ) {
            if (assetManager.isLoaded(assetDescriptor.fileName)
                    ) {
                assetManager.unload(assetDescriptor.fileName);
                assetManager.getLoadedAssets();
            }
        }

        log.debug("*************************AssetNumbers loaded=" + assetManager.getLoadedAssets());

    }

}
