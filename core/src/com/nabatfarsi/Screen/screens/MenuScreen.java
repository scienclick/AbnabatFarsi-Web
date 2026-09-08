package com.nabatfarsi.Screen.screens;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.nabatfarsi.Screen.game.GameController;
import com.nabatfarsi.common.GameManager;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.ActorGenerator;
import com.nabatfarsi.nabatfarsi;


/**
 * Created by AShamsa on 12/4/2017.
 */

public class MenuScreen extends ScreenAdapter {
    // == constants ==
    //private static final Logger log = new Logger(MenuScreen.class.getName(), Logger.DEBUG);

    // == attributes ==
    private OrthographicCamera camera;
    private Viewport viewport;
    private SpriteBatch batch;

    private boolean changeScreen = false;
    private ShapeRenderer renderer;
    private final nabatfarsi game;
    int menueLevel = 0;
    com.nabatfarsi.entity.CustomActor exit_icon;
    com.nabatfarsi.entity.CustomActor left_icon;
    com.nabatfarsi.entity.CustomActor right_icon;
    com.nabatfarsi.entity.CustomActor purchase_icon;
    com.nabatfarsi.entity.CustomActor[] menu_actors;
    private Stage stage;
    GameController controller;

    private TextureRegion alballoo;
    private TextureRegion bluBG;
    AssetManager assetmanager;


    private static TextureAtlas gamePlayAtlas;
    private com.nabatfarsi.util.debug.DebugCameraController debugCameraController;
    Obstacle o1 = new Obstacle();
    Obstacle o2 = new Obstacle();
    Obstacle o3 = new Obstacle();
    Obstacle o4 = new Obstacle();
    Obstacle o5 = new Obstacle();
    Obstacle o6 = new Obstacle();
    com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();


    public MenuScreen(nabatfarsi game, AssetManager assetManager, GameController controller_) {
        this.game = game;

        controller = controller_;
        assetManager = game.getAssetManager();
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_LOADINGPAGE);
        bluBG = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.BG0_loading);
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        alballoo = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.BG_albaloo);

        exit_icon = controller.getExit_icon();
        left_icon = controller.getLeft_icon();
        right_icon = controller.getRight_icon();
        purchase_icon = controller.getPurchase_icon();
        menu_actors = controller.getMenues_actors();

        o1.setPosition(com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj1_X, com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj1_Y);
        o2.setPosition(com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj2_X, com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj2_Y);
        o3.setPosition(com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj3_X, com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj3_Y);
        o4.setPosition(com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj4_X, com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj4_Y);
        o5.setPosition(com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj5_X, com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj5_Y);
        o6.setPosition(com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj6_X, com.nabatfarsi.config.MenuObsticlePositions.Menu_Obj6_Y);
        p = new com.nabatfarsi.entity.Player(.7f, 2f);




    }


    @Override
    public void show() {


//        log.debug("InitiateLevel");
        camera = new OrthographicCamera();
        viewport = new FitViewport(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT, camera);
        debugCameraController = new com.nabatfarsi.util.debug.DebugCameraController();
        debugCameraController.setStartPosition(GameConfig.WORLD_CENTER_X, GameConfig.WORLD_CENTER_Y);
        renderer = new ShapeRenderer();
        batch = new SpriteBatch();
        stage = new Stage(viewport);
        for (com.nabatfarsi.entity.CustomActor menu : menu_actors
                ) {
            stage.addActor(menu);
        }
        stage.addActor(exit_icon);
        stage.addActor(left_icon);
        stage.addActor(right_icon);
        if (!game.ISPURCHASED()) {
            stage.addActor(purchase_icon);
        }
        Gdx.input.setInputProcessor(stage);

    }


    @Override
    public void render(float delta) {
        com.nabatfarsi.util.GdxUtils.clearScreen();

        if (game.isUpdatemenueActorRequested()) {
            updateMenuActors(stage);
            game.setUpdatemenueActorRequested(false);
        }

        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        debugCameraController.handleDebugInput(delta);
        debugCameraController.applyTo(camera);
        batch.begin();


        draw();

        batch.end();

        stage.act();
        stage.draw();

        if (changeScreen) {
            game.setScreen(new GameScreen(game));
        }


        p.setPosition((float) Gdx.input.getX() / (float) Gdx.graphics.getWidth() * GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT - (float) Gdx.input.getY() / (float) Gdx.graphics.getHeight() * GameConfig.WORLD_HEIGHT);
        String msg = "px=" + p.getX() +
                "PY=" + p.getY() + "Ox=" + o1.getX() + "Oy=" + (o1.getY());
        menueLevel = com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu();
        int requestedlevel = 0;
        switch (menueLevel) {
            case 0:
                if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                    msg += "o1. Touched";
                    game.setMenueRequested(false);
                    requestedlevel = 0;
                    com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                    game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                    msg += "o2. Touched";
                    game.setMenueRequested(false);
                    requestedlevel = 2;
                    com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                    game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                    msg += "o3. Touched";
                    game.setMenueRequested(false);
                    requestedlevel = 4;
                    com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                    game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                    msg += "o4. Touched";
                    game.setMenueRequested(false);
                    requestedlevel = 6;
                    com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                    game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                    msg += "o5. Touched";
                    game.setMenueRequested(false);
                    requestedlevel = 8;
                    com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                    game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched() ) {
                    if (game.ISPURCHASED()) {
                        msg += "o6. Touched";
                        changeScreen = true;
                        game.setMenueRequested(false);
                        requestedlevel = 10;
                        GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new LoadingScreen(game, requestedlevel));
                    } else {
                        game.getGameEventListener().InitiateIAP();
                    }

                }
                break;
            case 1:
                if (game.ISPURCHASED()) {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o1. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 12;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o2. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 14;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o3. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 16;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o4. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 18;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o5. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 20;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o6. Touched";
                        changeScreen = true;
                        game.setMenueRequested(false);
                        requestedlevel = 22;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));

                    }

                } else {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    }
                }
                break;
            case 2:
                if (game.ISPURCHASED()) {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o1. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 24;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o2. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 26;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o3. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 28;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o4. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 30;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o5. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 32;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o6. Touched";
                        changeScreen = true;
                        game.setMenueRequested(false);
                        requestedlevel = 34;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));

                    }
                }else {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    }
                }
                break;
            case 3:
                if (game.ISPURCHASED()) {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o1. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 36;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o2. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 38;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o3. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 40;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o4. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 42;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o5. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 44;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o6. Touched";
                        changeScreen = true;
                        game.setMenueRequested(false);
                        requestedlevel = 46;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));

                    }
                }else {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    }
                }
                break;
            case 4:
                if (game.ISPURCHASED()) {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o1. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 48;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o2. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 50;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o3. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 52;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o4. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 54;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o5. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 56;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o6. Touched";
                        changeScreen = true;
                        game.setMenueRequested(false);
                        requestedlevel = 58;
                        com.nabatfarsi.common.GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new com.nabatfarsi.Screen.screens.LoadingScreen(game, requestedlevel));

                    }
                }else {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    }
                }
                break;
            case 5:
                if (game.ISPURCHASED()) {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o1. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 60;
                        GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new LoadingScreen(game, requestedlevel));
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();

                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();

                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();

                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        msg += "o2. Touched";
                        game.setMenueRequested(false);
                        requestedlevel = 62;
                        GameManager.INSTANCE.update_current_Level(requestedlevel);
                        game.setScreen(new LoadingScreen(game, requestedlevel));
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();

                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();


                    }
                } else {
                    if (o1.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o2.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o3.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o4.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o5.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    } else if (o6.isPlayerColliding(p) & Gdx.input.isTouched()) {
                        game.getGameEventListener().InitiateIAP();
                    }
                }
                break;

        }

//        log.debug(msg);

        renderDebug();
    }

    private void drawDebug() {
//        log.debug("drawDebug");
        //Player player = controller.getPlayer();
        //player.drawDebug(renderer);

        p.drawDebug(renderer);
        o1.drawDebug(renderer);
        o2.drawDebug(renderer);
        o3.drawDebug(renderer);
        o4.drawDebug(renderer);
        o5.drawDebug(renderer);
        o6.drawDebug(renderer);

    }

    private void renderDebug() {
//        log.debug("rendererDebug");

        viewport.apply();
        renderer.setProjectionMatrix(camera.combined);
        renderer.begin(ShapeRenderer.ShapeType.Line);

        if (Gdx.app.getType() == Application.ApplicationType.Desktop && true) {
            drawDebug();
        }


        renderer.end();

        com.nabatfarsi.util.ViewportUtils.drawGrid(viewport, renderer, true);
    }

    private void updateMenuActors(Stage stage) {
        for (Actor actor : stage.getActors()) {
            actor.remove();
        }
        stage.clear();
        menu_actors = ActorGenerator.GenerateMenueLevels(game.getAssetManager(), game);
        controller.setMenues_actors(menu_actors);
        menu_actors = controller.getMenues_actors();
        for (com.nabatfarsi.entity.CustomActor menu : menu_actors
                ) {
            stage.addActor(menu);
        }
        stage.addActor(exit_icon);
        stage.addActor(left_icon);
        stage.addActor(right_icon);
        if (!game.ISPURCHASED()) {
            stage.addActor(purchase_icon);
        }

    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void hide() {
//        log.debug("hide");
        GameManager.INSTANCE.update_current_Menu(0);
        dispose();
    }

    @Override
    public void dispose() {
//        log.debug("dispose");
        batch.dispose();
        batch = null;
        stage.dispose();

    }


    private void draw() {
        batch.draw(bluBG, 0, 0, GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
        batch.draw(alballoo, 0, 0, GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);

    }


}
