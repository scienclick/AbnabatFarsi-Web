package com.nabatfarsi.Screen.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.common.GameManager;
import com.nabatfarsi.config.GameAnimationConfig;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.entity.Background;
import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.entity.GameObjectBase;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.util.GdxUtils;
import com.nabatfarsi.util.TimerObject;
import com.nabatfarsi.util.ViewportUtils;
import com.nabatfarsi.util.debug.DebugCameraController;

import java.util.HashMap;

import static com.nabatfarsi.util.staticMethods.StaticMethods.GiveRandomNumberafterDelay;
import static com.nabatfarsi.util.staticMethods.StaticMethods.lagtimeElapsed;


public class GameRenderer implements Disposable, InputProcessor {
    private static final Logger log = new Logger(GameRenderer.class.getName(), Logger.DEBUG);


    //<editor-fold desc="----------Variables">
    // == attributes ==
    private OrthographicCamera camera;
    private Viewport viewport;
    private ShapeRenderer renderer;
    private boolean drawgrids = true;

    private SpriteBatch batch;

    private DebugCameraController debugCameraController;
    private final GameController controller;
    private final AssetManager assetManager;


    private Color oldColor;
    Background background;
    Player players[];
    Obstacle obstacles[];
    HashMap<Player, Obstacle> hmap;
    Player touchedplayer = null;
    Player activeTopplayer = null;

    Player bird;


    int level = 0;
    //float timer4bird=0;


    TimerObject timer4bird = new TimerObject();
    TimerObject timer4wordScaler = new TimerObject();
    TimerObject timer4selectingLetter = new TimerObject();
    TimerObject timer4movingLetter = new TimerObject();
    TimerObject timer4jump = new TimerObject();
    TimerObject timer4spin = new TimerObject();
    TimerObject timer4transition2Demo = new TimerObject();

    float scaler_active_player = 1;

    CustomActor pen_Left;
    CustomActor pen_Right;
    CustomActor menu_icon;
    CustomActor rePlay;
    CustomActor endscene;
    CustomActor endsceneFinal;
    CustomActor animator;
    CustomActor[] confetties = new CustomActor[GameConfig.CONFETTY_NUMBER];

    private Stage stage;
    private Stage finalstage;

    private Music ballloonPopSound;
    private Music correct;
    private Music inCorrect;
    private Music BackgroundMusic;
    private Music DemoBackgroundMusic;
    private Music MsgMusic;
    private Music WrdMusic;
    private Music CheerMusic;

    private boolean replayRequested = false;
    //</editor-fold>


    // == constructors ==
    public GameRenderer(AssetManager assetManager, GameController controller) {
//        log.debug("GameRenderer");

        this.assetManager = assetManager;
        this.controller = controller;

        init();
//        Gdx.input.setInputProcessor(this);
        Gdx.input.setCatchBackKey(true);

    }

    // == init ==
    public void init() {
//        log.debug("init");

        ballloonPopSound = assetManager.get(AssetDescriptors.BALLOONPOP_MUSIC);
        correct = assetManager.get(AssetDescriptors.CORRECT_MUSIC);
        inCorrect = assetManager.get(AssetDescriptors.INCORRECT_MUSIC);


        camera = new OrthographicCamera();
        viewport = new FitViewport(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT, camera);
        renderer = new ShapeRenderer();

        batch = new SpriteBatch();
        oldColor = new Color();

        // create debug camera controller
        debugCameraController = new DebugCameraController();
        debugCameraController.setStartPosition(GameConfig.WORLD_CENTER_X, GameConfig.WORLD_CENTER_Y);

        refreshLevel();

        stage = new Stage(viewport);
        finalstage = new Stage(viewport);
        //Gdx.input.setInputProcessor(stage);
        CheerMusic.setLooping(true);


    }


    // == public methods ==
    public void render(float delta) {
//        log.debug("render");


        hmap = controller.getHashMap();
        debugCameraController.handleDebugInput(delta);
        debugCameraController.applyTo(camera);

        refreshLevel();
        addAcotors2Stage();
        //updating by Touch, gives active player
        activeTopplayer = PlayerTouchUpdate(delta);

        MoveObjects(delta);
        BirdTouchUpdate(delta);
        GdxUtils.clearScreen();

        //Active player should render on top
        if (level % 2 == 0) {

            renderGamePlay(activeTopplayer, delta);
        } else if (level % 2 == 1) {
            renderGamePlay4Demo(activeTopplayer, delta);

            if (controller.isDemoPlayOver()) {

                patchBackground();

            }

        }

        DrawActors(delta);
        if (level % 2 == 0) {
            DynamicObjectDraw(delta, bird, true, false);
        }
        // render debug graphics
        renderDebug();

    }

    private void patchBackground() {
        batch.begin();
        background = controller.getBackground();
        // draw background

        batch.draw(background.getTextureRegion(),
                background.getX(), background.getY(),
                background.getWidth(), background.getHeight()
        );
        batch.end();
    }

    private TextureRegion releaseObjectTexture(GameObjectBase p, float delta, float lagTime) {

        if (p.getTimer() >= lagTime) {
            p.setIndexCounter(p.getIndexCounter() + 1);
            p.setTimer(0);
        }

        p.setTimer(p.getTimer() + delta);


        return p.getTextureRegion(p.getIndexCounter() % p.getTextureRegions().length);

    }

    private void renderGamePlay(Player topPlayer, float delta) {
//        log.debug("renderGamePlay4Demo");

        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();


        // draw background

        batch.draw(background.getTextureRegion(),
                background.getX(), background.getY(),
                background.getWidth(), background.getHeight()
        );


        // draw obstacle
        try {

            for (int i = 0; i < obstacles.length; i++) {
                if (!obstacles[i].isSettled()) {
                    batch.draw(obstacles[i].getTextureRegion(),
                            obstacles[i].getX(), obstacles[i].getY(),// x, y,
                            0, 0,// originX, originY
                            obstacles[i].getWidth(), obstacles[i].getHeight(),// width, height
                            1, 1, // scaleX, scaleY,
                            0f);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // draw player

        oldColor.set(batch.getColor());


        for (int i = 0; i < players.length; i++) {

            if (!players[i].equals(topPlayer)) {
                batch.setColor(players[i].getColor());

                TextureRegion t = players[i].getTextureRegion();
                batch.draw(t,
                        players[i].getX(), players[i].getY(),// x, y,
                        players[i].getWidth() / 2, players[i].getHeight() / 2,// originX, originY
                        players[i].getWidth(), players[i].getHeight(),// width, height
                        1, 1, // scaleX, scaleY,
                        players[i].isSettled() ? 0 : players[i].getNewrandomrotation());
            }

        }


        // draw Active player on top
        try {

            if (lagtimeElapsed(delta, com.nabatfarsi.config.GameAnimationConfig.ACTIVE_PLAYER_SCALER_LAG_TIME, timer4wordScaler)) {
                if (scaler_active_player < GameConfig.PLAYER_SIZE_SCALER_WHEN_DRAGED) {
                    scaler_active_player += .05;
                } else {
                    scaler_active_player -= 0.05;
                }

            }

            batch.setColor(topPlayer.getColor());

            batch.draw(topPlayer.getTextureRegion(),
                    topPlayer.getX(), topPlayer.getY(),// x, y,
                    topPlayer.getWidth() / 2, topPlayer.getHeight() / 2,// originX, originY
                    topPlayer.getWidth(), topPlayer.getHeight(),// width, height
                    scaler_active_player, scaler_active_player, // scaleX, scaleY,
                    0f);
        } catch (Exception e) {

        }

        batch.setColor(oldColor);


        batch.end();
    }

    private void renderGamePlay4Demo(Player topPlayer, float delta) {
//        log.debug("renderGamePlay4Demo");

        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        // draw background
        batch.draw(background.getTextureRegion(),
                background.getX(), background.getY(),
                background.getWidth(), background.getHeight()
        );

        if (!controller.isLevelOver()) {
            // draw setteled player first
            oldColor.set(batch.getColor());
            for (int i = 0; i < players.length; i++) {
                if (!players[i].equals(topPlayer)) {
                    //batch.setColor(players[i].getColor());
                    if (players[i].isSettled()) {
                        batch.draw(players[i].getTextureRegion(),
                                players[i].getX(), players[i].getY(),// x, y,
                                players[i].getWidth() / 2, players[i].getHeight() / 2,// originX, originY
                                players[i].getWidth(), players[i].getHeight(),// width, height
                                1, 1, // scaleX, scaleY,
                                players[i].isSettled() ? 0 : players[i].getNewrandomrotation());
                    }
                }

            }
            // draw unsetteled player
            for (int i = 0; i < players.length; i++) {

                if (!players[i].equals(topPlayer)) {

                    if (!players[i].isSettled()) {
                        TextureRegion t = players[i].getTextureRegion();
                        //balloon display
                        if (!players[i].isBallonPopped()) {
                            batch.setColor(oldColor);
                            t = players[i].getTempTextureRegion();
                            players[i].setSize(GameConfig.BALLOON__DEMO_SIZE * t.getRegionWidth() / t.getRegionHeight(), GameConfig.BALLOON__DEMO_SIZE);
                            batch.draw(t,
                                    players[i].getX(), players[i].getY(),// x, y,
                                    players[i].getWidth() / 2, players[i].getHeight() / 2,// originX, originY
                                    players[i].getWidth(), players[i].getHeight(),// width, height
                                    1, 1, // scaleX, scaleY,
                                    players[i].isSettled() ? 0 : players[i].getNewrandomrotation());
                        } else {
                            players[i].setSize(GameConfig.PLAYER__DEMO_SIZE * t.getRegionWidth() / t.getRegionHeight(), GameConfig.PLAYER__DEMO_SIZE);

                            batch.setColor(players[i].getColor());

                            batch.draw(t,
                                    players[i].getX(), players[i].getY(),// x, y,
                                    players[i].getWidth() / 2, players[i].getHeight() / 2,// originX, originY
                                    players[i].getWidth(), players[i].getHeight(),// width, height
                                    1, 1, // scaleX, scaleY,
                                    players[i].isSettled() ? 0 : players[i].getNewrandomrotation());
                        }


                    }
                }

            }
            // draw Active player on top
            try {

                if (lagtimeElapsed(delta, com.nabatfarsi.config.GameAnimationConfig.ACTIVE_PLAYER_SCALER_LAG_TIME, timer4wordScaler)) {
                    if (scaler_active_player < GameConfig.PLAYER_SIZE_SCALER_WHEN_DRAGED) {
                        scaler_active_player += .05;
                    } else {
                        scaler_active_player -= 0.05;
                    }

                }

                //if (topPlayer.isBallonPopped()) {
                batch.setColor(topPlayer.getColor());
                //}
                batch.draw(topPlayer.getTextureRegion4Dragging(),
                        topPlayer.getX(), topPlayer.getY(),// x, y,
                        topPlayer.getWidth() / 2, topPlayer.getHeight() / 2,// originX, originY
                        topPlayer.getWidth(), topPlayer.getHeight(),// width, height
                        scaler_active_player, scaler_active_player, // scaleX, scaleY,
                        0f);
            } catch (Exception e) {

            }
        }
        batch.setColor(oldColor);


        batch.end();
    }

    // == private methods ==
    private void drawDebug() {
//        log.debug("drawDebug");
        //Player player = controller.getPlayer();
        //player.drawDebug(renderer);
        for (int i = 0; i < players.length; i++) {
            players[i].drawDebug(renderer);
        }

        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i].drawDebug(renderer);
        }
/*        for (Obstacle obstacle : obstacles) {
            obstacle.drawDebug(renderer);
        }*/
        bird.drawDebug(renderer);
    }

    private void renderDebug() {
//        log.debug("rendererDebug");

        viewport.apply();
        renderer.setProjectionMatrix(camera.combined);
        renderer.begin(ShapeRenderer.ShapeType.Line);

        if (Gdx.app.getType() == Application.ApplicationType.Desktop && drawgrids) {
            drawDebug();
        }


        renderer.end();

        ViewportUtils.drawGrid(viewport, renderer, drawgrids);
    }

    private void DrawActors(float delta) {
//        log.debug("DrawActors");


        //managing end of each level
        if (controller.isLevelOver()) {
            Gdx.input.setInputProcessor(stage);

            //end of level evens
            if (level % 2 == 0) {
                DropConfetti();
                stage.act();
                stage.draw();
                if (CheerMusic.isLooping()) {
                    CheerMusic.play();
                    CheerMusic.setLooping(false);
                }
                if (WrdMusic.isLooping() & !CheerMusic.isPlaying()) {
                    WrdMusic.setLooping(false);
                    WrdMusic.play();
                } else if (WrdMusic.isLooping() == false & !WrdMusic.isPlaying()) {
                    if (timer4transition2Demo.isTimeElapsed()) {
                        int levelnum = GameManager.INSTANCE.get_IspurchasedKey() ? GameConfig.NUMBER_OF_LEVEL : 9;
                        int newlevel = (GameManager.INSTANCE.get_current_Level() + GameConfig.LEVELSTEP);
                        if (newlevel > levelnum) {
                            newlevel = 0;
                        }
                        GameManager.INSTANCE.update_previous_Level(GameManager.INSTANCE.get_current_Level());
                        GameManager.INSTANCE.update_current_Level(newlevel);
                        controller.getGame().setNextLevelRequested(true);
                    }
                    float delay = GameConfig.TRANSITIONFROMPLAY2DEMOINODDLEVELS - 1; // seconds
                    Timer.schedule(new Timer.Task() {
                        @Override
                        public void run() {
                            timer4transition2Demo.setTimeElapsed(true);
                        }
                    }, delay);


                }


                if (MsgMusic != null) {
                    MsgMusic.pause();
                }


            }

            //end of level odds
            if (level % 2 == 1) {
                if (GameManager.INSTANCE.getReplay_requested() == 1) {

                    animator.setAge(0);//this causes controller.isDemoPlayOver()=false
                    replayRequested = true;//this is to let stage to getupdated, other wise int replayrequested = 0; doesnt let it update
                    MsgMusic.setLooping(true);
                }
                //demo is over so show pen_Left and replay
                if (controller.isDemoPlayOver()) {
                    Gdx.input.setInputProcessor(finalstage);
                    BackgroundMusic.play();
                    DemoBackgroundMusic.stop();
                    //stage finals contains replay and pen_Left
                    finalstage.act();
                    finalstage.draw();

                    if (MsgMusic.isLooping()) {
                        MsgMusic.play();
                        MsgMusic.setLooping(false);
                    }


                    //play demo
                } else {

//                    if (lagtimeElapsed(delta, 3, timer4transition2Demo)) {
//                        timer4transition2Demo.setTimeElapsed(true);
//                    }
//                    if (timer4transition2Demo.isTimeElapsed()) {

                    stage.act();
                    stage.draw();
                    BackgroundMusic.pause();
                    DemoBackgroundMusic.play();
                    int replayrequested = 0;
                    GameManager.INSTANCE.update_replay_requested(replayrequested);
                    if (touchedplayer != null) {
                        touchedplayer.getSound().pause();
                    }

//                    }


                }
            }

            //level is not over
        } else {
            CheerMusic.stop();


            BackgroundMusic.play();
            Gdx.input.setInputProcessor(this);
            if (animator != null) {
                DemoBackgroundMusic.stop();
                animator.setAge(0f);
            }

        }


    }

    private Player PlayerTouchUpdate(float delta) {
        touchedplayer = null;
        Player topPlayer = new Player();
        if (Gdx.input.isTouched() && !controller.isLevelOver()) {
            Vector2 screenTouch = new Vector2(Gdx.input.getX(), Gdx.input.getY());
            Vector2 worldTouch = viewport.unproject(new Vector2(screenTouch));
//            for (Player p : players) {
            for (int i = 0; i < players.length; i++) {

                //}
                if (!players[i].isSettled()) {
                    worldTouch.x = MathUtils.clamp(worldTouch.x, players[i].getWidth() / 2, GameConfig.WORLD_WIDTH - players[i].getWidth() / 2);
                    worldTouch.y = MathUtils.clamp(worldTouch.y, players[i].getHeight() / 3, GameConfig.WORLD_HEIGHT - players[i].getHeight() / 3);
                }
                if (players[i].isPlayerTouched(worldTouch) & touchedplayer == null & !players[i].isSettled()) {
                    touchedplayer = players[i];
                    break;
                }
            }


            if (touchedplayer != null) {
                touchedplayer.setX(worldTouch.x - touchedplayer.getWidth() / 2);

                touchedplayer.setY(worldTouch.y - touchedplayer.getHeight() / 2);
//                if ((touchedplayer.getTextureRegions() != null) && touchedplayer.getTextureRegions().length != 0) {
//
//                    if (com.nabatfarsi.config.GameAnimationConfig.DYNAMIC) {
//                        touchedplayer.setTextureRegion(releaseObjectTexture(touchedplayer, delta, com.nabatfarsi.config.GameAnimationConfig.PLAYER_FRAME_LAG_TIME));
//                    }
//                }
                topPlayer = touchedplayer;

/*                log.debug("number of players:" + (hmap.size()));
                for (Player p : hmap.keySet()
                        ) {
                    log.debug("player:" + p.getTextureRegions()[0]);
                    log.debug("obsticle:" + hmap.get(p).getTextureRegion());
                    log.debug("TouchedPlayer:" + touchedplayer.getTextureRegion());
                }
                log.debug("-----------------------------------------------------------------------");*/

            }

        }
//        } else {
//            touchedplayer = null;
//        }
        if (touchedplayer != null) {
            if (!touchedplayer.isBallonPopped() & level % 2 == 1) {
                ballloonPopSound.play();
                touchedplayer.setBallonPopped(true);
            } else {
                if (!touchedplayer.isSettled()) {
                    //for (Player p:players   )
                    for (int i = 0; i < players.length; i++) {
                        if (!players[i].equals(touchedplayer)) {

                            if (players[i].getSound() != touchedplayer.getSound()) {
                                players[i].getSound().stop();
                            }

                        }
                    }
                    touchedplayer.getSound().play();
                }

            }


        }

        return topPlayer;

    }

    private void BirdTouchUpdate(float delta) {

        if (Gdx.input.isTouched()) {

            if (touchedplayer == null) {
                Vector2 screenTouch = new Vector2(Gdx.input.getX(), Gdx.input.getY());
                Vector2 worldTouch = viewport.unproject(new Vector2(screenTouch));
                bird.setDestination(worldTouch);
            }
        }
    }

    private void DynamicObjectDraw(float delta, Player dynObj, boolean flap, boolean colorDraw) {

        if (colorDraw) {
            viewport.apply();
            batch.setProjectionMatrix(camera.combined);
            batch.begin();
            oldColor.set(batch.getColor());
            batch.setColor(dynObj.getColor());


            float birdflapingrate;
            if (dynObj.isReachedDestination()) {
                birdflapingrate = com.nabatfarsi.config.GameAnimationConfig.BIRD_FLAP_FRAME_LAG_TIME;
            } else
                birdflapingrate = com.nabatfarsi.config.GameAnimationConfig.BIRD_FLAP_ONCALL_FRAME_LAG_TIME;

            if (flap) {
                dynObj.setTextureRegion(releaseObjectTexture(dynObj, delta, birdflapingrate));
            }
            batch.draw(dynObj.getTextureRegion(),
                    dynObj.getX(), dynObj.getY(),// x, y,
                    0, 0,// originX, originY
                    dynObj.getWidth(), dynObj.getHeight(),// width, height
                    dynObj.isMoveRight() ? 1 : -1, 1, // scaleX, scaleY,
                    dynObj.getInitialrandomrotation());

            batch.setColor(oldColor);
            batch.end();
        } else {
            viewport.apply();
            batch.setProjectionMatrix(camera.combined);
            batch.begin();


            float birdflapingrate;
            if (dynObj.isReachedDestination()) {
                birdflapingrate = com.nabatfarsi.config.GameAnimationConfig.BIRD_FLAP_FRAME_LAG_TIME;
            } else
                birdflapingrate = com.nabatfarsi.config.GameAnimationConfig.BIRD_FLAP_ONCALL_FRAME_LAG_TIME;

            if (flap) {
                dynObj.setTextureRegion(releaseObjectTexture(dynObj, delta, birdflapingrate));
            }
            batch.draw(dynObj.getTextureRegion(),
                    dynObj.getX(), dynObj.getY(),// x, y,
                    0, 0,// originX, originY
                    dynObj.getWidth(), dynObj.getHeight(),// width, height
                    dynObj.isMoveRight() ? 1 : -1, 1, // scaleX, scaleY,
                    dynObj.getInitialrandomrotation());


            batch.end();
        }
    }

    private void SettleActivePlayer(Player activeTopplayer) {
        boolean hitTarget = false;
        Obstacle obstacle = hmap.get(activeTopplayer);

        try {

            if (obstacle != null && obstacle.isPlayerColliding(activeTopplayer)) {
                activeTopplayer.setSettled(true);
                obstacle.setSettled(true);
                activeTopplayer.setTextureRegion(activeTopplayer.getTextureRegion(0));
                activeTopplayer.setInitialrandomrotation(0f);
                hitTarget = true;
                correct.play();


                if (level % 2 == 1) {
                    activeTopplayer.setPosition(0, 0);
                    activeTopplayer.setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT, false);

                } else {
                    activeTopplayer.setPosition(obstacle.getX(), obstacle.getY());
                }
            }

        } catch (Exception e) {
            ////e.printStackTrace();
        }

        if (!hitTarget) {//checking to see if it hit another letter
/*            for (Obstacle o : obstacles
                    )*/
            for (int i = 0; i < obstacles.length; i++) {
                if (obstacles[i] != null && obstacles[i].isPlayerColliding(activeTopplayer)) {
                    activeTopplayer.setPosition(obstacles[i].getX() - GameConfig.REJECTIONSIZE,
                            obstacles[i].getY() - GameConfig.REJECTIONSIZE);
                    inCorrect.play();
                    break;
                }


            }
        }


        return;
    }

    private void refreshLevel() {

        background = controller.getBackground();
        bird = controller.getBird();
        obstacles = controller.getObstacles();
        players = controller.getPlayers();
        pen_Left = controller.getPen_Left();
        pen_Right = controller.getPen_Right();
        menu_icon = controller.getMenu_icon();
        rePlay = controller.getRePlay();
        endscene = controller.getEndScene();
        endsceneFinal = controller.getEndSceneFinal();
        level = controller.getGameLevel();
        animator = controller.getAnimationActor();
        confetties = controller.getConfetties();
        BackgroundMusic = controller.getBackroundMusic();
        CheerMusic = controller.getCheerMusic();
        WrdMusic = controller.getWordMusic();

        DemoBackgroundMusic = controller.getDemoMusic();

        MsgMusic = controller.getMsgMusic();

        //endbackground = controller.getEndbackground();


    }

    private void addAcotors2Stage() {
//        log.debug("addAcotors2Stage");
        stage.clear();//damn important took one day
        finalstage.clear();
        if (level % 2 == 1) {

            if (!controller.isDemoPlayOver()) {

                TextureRegion t = (TextureRegion) animator.getAnimation().getKeyFrame(animator.getAge(), true);
//                    log.debug(t.toString());
                animator.setRegion(t);
                animator.setAge(animator.getAge() + Gdx.graphics.getDeltaTime());


                stage.addActor(endscene);
                stage.addActor(controller.getGroup());
            } else {
                //demo is over
                finalstage.addActor(endscene);//white background to cover black and white
                finalstage.addActor(endsceneFinal);
                finalstage.addActor(pen_Left);
                finalstage.addActor(pen_Right);
                finalstage.addActor(menu_icon);
                finalstage.addActor(rePlay);

            }

            if (replayRequested) {
                stage.addActor(endscene);
                stage.addActor(controller.getGroup());
                replayRequested = false;
                MsgMusic.stop();

            }
            if (controller.getGame().isMenueRequested()) {
                MsgMusic.stop();
            }


        } else {

            for (int i = 0; i < confetties.length; i++) {
                stage.addActor(confetties[i]);
            }
//            stage.addActor(pen_Left);
//            stage.addActor(pen_Right);
//            stage.addActor(menu_icon);
        }


    }

    private void MoveObjects(float delta) {
        try {
            if (bird != null) {
                bird.ShuBirdieWithDelay(GameAnimationConfig.BIRD_MOVEMENT_RANDOM_PER_DELTA,
                        delta,
                        GameAnimationConfig.BIRD_MOVEMENT_RANDOM_FRAME_LAG_TIME,
                        timer4bird);
            }

            //random move
            timer4movingLetter.setIndexer(GiveRandomNumberafterDelay(delta, com.nabatfarsi.config.GameAnimationConfig.LETTER_SELECTION_PERIOD_FOR_MOVEMENT, timer4selectingLetter, 0, players.length - 1));

            if (players[timer4movingLetter.getIndexer()] != null &
                    !players[timer4movingLetter.getIndexer()].isSettled()) {
                players[timer4movingLetter.getIndexer()]
                        .ShuBirdieWithDelay(com.nabatfarsi.config.GameAnimationConfig.LETTER_MOVEMENT_RANDOM_PER_DELTA,
                                delta,
                                com.nabatfarsi.config.GameAnimationConfig.LETTER_MOVEMENT_RANDOM_FRAME_LAG_TIME,
                                timer4movingLetter, -1f, 1f);
            }
            //jump

            if (players[(timer4movingLetter.getIndexer() + 1) % players.length] != null &
                    !players[(timer4movingLetter.getIndexer() + 1) % players.length].isSettled()) {
                players[(timer4movingLetter.getIndexer() + 1) % players.length]
                        .Jump(delta, com.nabatfarsi.config.GameAnimationConfig.JUMPING_PERIOD_LAG_TIME, timer4jump);

            }

            //Spin

            if (players[(timer4movingLetter.getIndexer() + 2) % players.length] != null &
                    !players[(timer4movingLetter.getIndexer() + 2) % players.length].isSettled()) {
                players[(timer4movingLetter.getIndexer() + 2) % players.length]
                        .Spin(delta, com.nabatfarsi.config.GameAnimationConfig.SPIN_PERIOD_LAG_TIME, timer4spin);

            }


        } catch (Exception e) {
            ///e.printStackTrace();
        }
    }

    private void DropConfetti() {
        for (int i = 0; i < confetties.length; i++) {
            CustomActor c = confetties[i];
            float x = c.getX();
            float y = c.getY();
            c.setPosition(x += c.getVelocityX(), y += c.getVelocitY());
            c.setVelocityY(c.getVelocitY() - com.nabatfarsi.config.GameAnimationConfig.CONFETTY_VELOCITY_STEP);
        }
    }

    //==Template Methods
    public void resize(int width, int height) {
        viewport.update(width, height, true);
        ViewportUtils.debugPixelPerUnit(viewport);
    }

    //<editor-fold desc="----------Overrides">
    @Override
    public void dispose() {
//        log.debug("Dispose");

        renderer.dispose();
        batch.dispose();
        stage.dispose();
        finalstage.dispose();
        //ballloonPopSound.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.G) {
            drawgrids = !drawgrids;

        }
        if (keycode == Input.Keys.BACK) {
            controller.getGame().setMenueRequested(true);
            controller.getGame().setUpdatemenueActorRequested(true);
            GameManager.INSTANCE.update_previous_Level(GameManager.INSTANCE.get_current_Level());
        }
        return false;

    }




    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        //Checks if Active player has touched its counterpart and settles it
        SettleActivePlayer(activeTopplayer);
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }


    @Override
    public boolean scrolled(float amountX, float amountY) {
        // handle scroll if needed, or just return false
        return false;
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) { return false; } // ← new!
}
