package com.nabatfarsi.level;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.nabatfarsi.assets.RegionNames;
import com.nabatfarsi.common.GameManager;
import com.nabatfarsi.config.GameColorsConfettis;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.nabatfarsi;

import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeIn;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.fadeOut;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.moveBy;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.parallel;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.repeat;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.rotateTo;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleBy;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.scaleTo;
import static com.badlogic.gdx.scenes.scene2d.actions.Actions.sequence;
import static com.nabatfarsi.config.GameConfig.MENU_NUM;


public class ActorGenerator {
    private static TextureAtlas gamePlayAtlas;
    static CustomActor endScene;
    static CustomActor actor;


    public static CustomActor GenerateLeftLevelArrow(AssetManager assetManager, nabatfarsi thegame) {
        final nabatfarsi game = thegame;
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(RegionNames.LeftLevelArrow);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                GameConfig.PEN_PAD,
                GameConfig.PEN_PAD
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                int levelnum = GameConfig.NUMBER_OF_LEVEL;
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                int newlevel = (com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level() + GameConfig.LEVELSTEP);
                if (newlevel > levelnum)
                    newlevel = 0;
                GameManager.INSTANCE.update_previous_Level(com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level());
                GameManager.INSTANCE.update_current_Level(newlevel);

                game.setNextLevelRequested(true);//ready to load new data in Gamescreen


            }


        });


        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateRightLevelArrow(AssetManager assetManager, nabatfarsi thegame) {
        final nabatfarsi game = thegame;
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.RightLevelArrow);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                GameConfig.WORLD_WIDTH - GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight() - GameConfig.PEN_PAD,
                GameConfig.PEN_PAD
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {

            int levelnum = GameConfig.NUMBER_OF_LEVEL;

            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                int newlevel = (com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level() - GameConfig.LEVELSTEP) % levelnum;

                newlevel -= 2;
                if (newlevel < 0)
                    newlevel = levelnum - 1;
                GameManager.INSTANCE.update_previous_Level(com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level());
                GameManager.INSTANCE.update_current_Level(newlevel);
                game.setPreviousLevelRequested(true);//ready to load new data in Gamescreen


            }


        });
//// TODO: 12/23/2017 should apear later

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateMenuIcon(AssetManager assetManager, nabatfarsi thegame) {
        final nabatfarsi game = thegame;
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.MENUE);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                GameConfig.PEN_PAD,
                GameConfig.WORLD_HEIGHT - GameConfig.PEN_HEIGHT - GameConfig.PEN_PAD
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                game.setMenueRequested(true);//ready to load new data in Gamescreen
                GameManager.INSTANCE.update_previous_Level(com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level());


            }


        });
//// TODO: 12/23/2017 should apear later

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateExitIcon(AssetManager assetManager, nabatfarsi thegame) {
        final nabatfarsi game = thegame;
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.EXIT);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                GameConfig.PEN_PAD,
                GameConfig.WORLD_HEIGHT - GameConfig.PEN_HEIGHT - GameConfig.PEN_PAD
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                GameManager.INSTANCE.update_previous_Level(com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level());

                Gdx.app.exit();

            }


        });
//// TODO: 12/23/2017 should apear later

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateLeftIconinMenueScreen(AssetManager assetManager, nabatfarsi thegame) {

        final nabatfarsi game = thegame;
        final AssetManager assetM = assetManager;

        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.LEFT);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                GameConfig.PEN_PAD,
                (GameConfig.WORLD_HEIGHT - GameConfig.PEN_HEIGHT) / 2
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                GameManager.INSTANCE.update_previous_Menu(com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu());
                int newMenue = (com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu() + 1);
                if (newMenue > MENU_NUM) {
                    newMenue = MENU_NUM;
                }
                GameManager.INSTANCE.update_current_Menu(newMenue);
                game.setUpdatemenueActorRequested(true);//ready to load new data in Gamescreen


            }


        });
//// TODO: 12/23/2017 should apear later

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateRightIconinMenueScreen(AssetManager assetManager, nabatfarsi thegame) {
        final nabatfarsi game = thegame;
        final AssetManager assetM = assetManager;
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.RIGHT);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                GameConfig.WORLD_WIDTH - GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight() - GameConfig.PEN_PAD,
                (GameConfig.WORLD_HEIGHT - GameConfig.PEN_HEIGHT) / 2
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                GameManager.INSTANCE.update_previous_Menu(com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu());
                int newMenue = (com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu() - 1);
                if (newMenue < 0) {
                    newMenue = 0;
                }
                GameManager.INSTANCE.update_current_Menu(newMenue);
                game.setUpdatemenueActorRequested(true);//ready to load new data in Gamescreen


            }


        });
//// TODO: 12/23/2017 should apear later

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }
    public static CustomActor GeneratePurchaseIconinMenueScreen(AssetManager assetManager, nabatfarsi thegame) {
        final nabatfarsi game = thegame;

        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(RegionNames.PURCHASEDUI);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.PEN_HEIGHT);
        pen.setPosition(
                (GameConfig.WORLD_WIDTH- GameConfig.PEN_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight())/2f,
                GameConfig.PEN_PAD
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                return true;  // must return true for touchUp event to occur
            }
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                // Purchase button hidden in web version (all content free)
            }


        });

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateReplay(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.REPLAY);
        final com.nabatfarsi.entity.CustomActor pen = new com.nabatfarsi.entity.CustomActor(textureRegion);
        pen.setSize(GameConfig.REPLAY_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), GameConfig.REPLAY_HEIGHT);
        pen.setPosition(
                (GameConfig.WORLD_WIDTH - GameConfig.REPLAY_HEIGHT * textureRegion.getRegionWidth() / textureRegion.getRegionHeight()) / 2,
                1 + (GameConfig.WORLD_HEIGHT - GameConfig.REPLAY_HEIGHT) / 2
        );

        pen.setTouchable(Touchable.enabled);
        pen.addListener(new InputListener() {
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                //pen.addAction(rotateBy(90f, 1f));

                pen.addAction(scaleTo(GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DOWN, GameConfig.PEN_SCALE_DURATION));
                //pen.addAction(scaleTo(.5f, .5f, 2f));
                return true;  // must return true for touchUp event to occur
            }

            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                pen.addAction(scaleTo(GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_UP, GameConfig.PEN_SCALE_DURATION));
                int replayrequested = 1;
                com.nabatfarsi.common.GameManager.INSTANCE.update_replay_requested(replayrequested);

            }


        });
//// TODO: 12/23/2017 should apear later

        Action action = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        pen.addAction(action);
        pen.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);

        return pen;

    }

    public static CustomActor GenerateEndScene(LevelBase L, String regionName) {
        endScene = L.GenerateEndScene(regionName);
        Action action2 = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        //endScene.addAction(action2);

        return endScene;
    }

    public static CustomActor GenerateActor(LevelBase L, AssetManager thisassetManager) {
        actor = L.GenerateAnimatedActor(thisassetManager);
        Action action2 = sequence(
                fadeOut(GameConfig.PEN_FADOUT_DURATION),
                fadeIn(GameConfig.PEN_FADIN_DURATION));

        actor.addAction(action2);
        return actor;
    }

    public static CustomActor GenerateConfetti(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        TextureRegion textureRegion = gamePlayAtlas.findRegion(GameColorsConfettis.GetRandomConfettiRegion());
        final com.nabatfarsi.entity.CustomActor confetti = new com.nabatfarsi.entity.CustomActor(textureRegion);
        float confettyHeight = MathUtils.random(GameConfig.MIN_CONFETTY_HEIGHT, GameConfig.MAX_CONFETTY_HEIGHT);
        confetti.setSize(confettyHeight * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), confettyHeight);
        confetti.setPosition(MathUtils.random(GameConfig.MIN_X_CONFETTIPOSITION, GameConfig.MAX_X_CONFETTIPOSITION), GameConfig.CONFETTY_STARTING_Y);


        Action action = parallel(
                fadeOut(GameConfig.CONFETTI_DURATION, Interpolation.circle),
                scaleTo(GameConfig.CONFETTI_SCALE, GameConfig.CONFETTI_SCALE, GameConfig.CONFETTI_DURATION, Interpolation.sine),
                rotateTo(GameConfig.CONFETTY_ROTATION, GameConfig.CONFETTI_DURATION, Interpolation.sine));

        confetti.addAction(action);
        confetti.setName(com.nabatfarsi.assets.ActorNames.LeftLevelArrow);


        confetti.setVelocityY(MathUtils.random(-com.nabatfarsi.config.GameAnimationConfig.INITIALVELOCITY_Y, com.nabatfarsi.config.GameAnimationConfig.INITIALVELOCITY_Y));
        confetti.setVelocityX(MathUtils.random(-com.nabatfarsi.config.GameAnimationConfig.INITIALVELOCITY_X, com.nabatfarsi.config.GameAnimationConfig.INITIALVELOCITY_X));

        return confetti;

    }

    public static CustomActor[] GenerateMenueLevels(AssetManager assetManager, final nabatfarsi thegame) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_GENERAL);
        final nabatfarsi game = thegame;
        final com.nabatfarsi.entity.CustomActor[] M = new com.nabatfarsi.entity.CustomActor[MENU_NUM + 1];
        for (int i = 0; i <= MENU_NUM; i++) {
            TextureRegion textureRegion = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.M[i]);
            M[i] = new com.nabatfarsi.entity.CustomActor(textureRegion);
            M[i].setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
            M[i].setPosition((-i + com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu()) * GameConfig.WORLD_WIDTH, 0);
            int mult = com.nabatfarsi.common.GameManager.INSTANCE.get_current_Menu() - com.nabatfarsi.common.GameManager.INSTANCE.get_previous_Menu();
            Action action = sequence(
                    moveBy(-mult * .15f, 0, .15f),
                    moveBy(mult * .15f, 0, .5f, Interpolation.bounceOut)
            );
            M[i].addAction(action);
        }

        return M;
    }

}
