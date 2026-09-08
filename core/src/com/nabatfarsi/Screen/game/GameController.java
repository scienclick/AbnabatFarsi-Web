package com.nabatfarsi.Screen.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.utils.Logger;
import com.badlogic.gdx.utils.Timer;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.instances.D14_jelle;
import com.nabatfarsi.level.instances.D4_toop;
import com.nabatfarsi.level.instances.D9_khorshid;
import com.nabatfarsi.level.instances.L10_drakht;
import com.nabatfarsi.level.instances.L11_zrt;
import com.nabatfarsi.level.instances.L13_zanboor;
import com.nabatfarsi.level.instances.L16_shalgardan;
import com.nabatfarsi.level.instances.L22_ghavas;
import com.nabatfarsi.level.instances.L24_ghlm;
import com.nabatfarsi.level.instances.L28_mooshk;
import com.nabatfarsi.level.instances.L29_naghashi;
import com.nabatfarsi.level.instances.L30_vazneh;
import com.nabatfarsi.level.instances.L31_hvapeima;
import com.nabatfarsi.level.instances.L4_toop;
import com.nabatfarsi.nabatfarsi;

import java.util.HashMap;


/**
 * Created by goran on 27/08/2016.
 */
public class GameController {
    //<editor-fold desc="----------Variables">
    boolean over = false;

    // == constants ==
    private static final Logger log = new Logger(GameController.class.getName(), Logger.DEBUG);

    //Public
    private AssetManager assetManager;
    private TextureAtlas gamePlayAtlas;

    public nabatfarsi getGame() {
        return game;
    }

    private nabatfarsi game;
    // == attributes ==
    private com.nabatfarsi.entity.Player player;
    private com.nabatfarsi.entity.Player[] players;

    private Obstacle[] obstacles;

    private HashMap<com.nabatfarsi.entity.Player, Obstacle> hashMap;

    private com.nabatfarsi.entity.Background background;

    private Music BackroundMusic;
    private Music DemoMusic;
    private Music MsgMusic;


    private Music wordMusic;


    private Music CheerMusic;

    private com.nabatfarsi.entity.Player bird;

    private Group group = new Group();
    private com.nabatfarsi.entity.CustomActor pen_Left;
    private com.nabatfarsi.entity.CustomActor pen_Right;
    private com.nabatfarsi.entity.CustomActor menu_icon;
    private com.nabatfarsi.entity.CustomActor exit_icon;
    private com.nabatfarsi.entity.CustomActor left_icon;
    private com.nabatfarsi.entity.CustomActor right_icon;
    private com.nabatfarsi.entity.CustomActor purchase_icon;
    private com.nabatfarsi.entity.CustomActor[] menues_actors;


    private com.nabatfarsi.entity.CustomActor rePlay;
    private com.nabatfarsi.entity.CustomActor endScene;


    private com.nabatfarsi.entity.CustomActor endSceneFinal;


    private com.nabatfarsi.entity.CustomActor animationActor;
    com.nabatfarsi.entity.CustomActor[] confetties = new com.nabatfarsi.entity.CustomActor[GameConfig.CONFETTY_NUMBER];


    int gameLevel = 0;
    boolean isOver;
    //</editor-fold>


    public GameController(AssetManager assetManager, nabatfarsi game) {
        this.assetManager = assetManager;
        this.game = game;
        init();
    }


    public void init() {
        com.nabatfarsi.util.GdxUtils.clearScreen();

        try {
            gameLevel = com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level();
        } catch (Exception e) {
            gameLevel = GameConfig.LEVEL;
            //e.printStackTrace();
        }


        InitiateLevel();
        // create background

        //background = LevelGenerator.GenerateBackground();
        if (gameLevel % 2 == 0) {
            for (int i = 0; i < confetties.length; i++) {
                confetties[i] = com.nabatfarsi.level.ActorGenerator.GenerateConfetti(assetManager);
            }
            background = com.nabatfarsi.level.LevelGenerator.GenerateBackground();
        } else if (gameLevel % 2 == 1) {

            if (!isDemoPlayOver()) {
                background = com.nabatfarsi.level.LevelGenerator.GenerateBackground(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_start));
                confetties = null;
            } else {
                background = com.nabatfarsi.level.LevelGenerator.GenerateBackground();
            }
        }

        bird = com.nabatfarsi.level.LevelGenerator.GenerateBird(assetManager);
        pen_Left = com.nabatfarsi.level.ActorGenerator.GenerateLeftLevelArrow(assetManager, game);
        pen_Right = com.nabatfarsi.level.ActorGenerator.GenerateRightLevelArrow(assetManager, game);
        menu_icon = com.nabatfarsi.level.ActorGenerator.GenerateMenuIcon(assetManager, game);
        exit_icon = com.nabatfarsi.level.ActorGenerator.GenerateExitIcon(assetManager, game);
        left_icon = com.nabatfarsi.level.ActorGenerator.GenerateLeftIconinMenueScreen(assetManager, game);
        right_icon = com.nabatfarsi.level.ActorGenerator.GenerateRightIconinMenueScreen(assetManager, game);
        purchase_icon = com.nabatfarsi.level.ActorGenerator.GeneratePurchaseIconinMenueScreen(assetManager, game);
        menues_actors = com.nabatfarsi.level.ActorGenerator.GenerateMenueLevels(assetManager, game);
        rePlay = com.nabatfarsi.level.ActorGenerator.GenerateReplay(assetManager);

        BackroundMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.BACKGROUND_MUSIC);
        CheerMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.CHEER_MUSIC);


    }

    public void update(float delta) {

        if (isLevelOver() & gameLevel != com.nabatfarsi.common.GameManager.INSTANCE.get_current_Level()) {
            for (com.nabatfarsi.entity.Player p : players
                    ) {
                p.setSettled(false);

            }
            init();
        }



    }

    public boolean isLevelOver() {
        //return isPlayerCollidingWithObstacle();

        for (com.nabatfarsi.entity.Player p : players
                ) {
            if (!p.isSettled()) {
                return false;
            }
        }
        if (gameLevel % 2 == 1) {
            float delay = GameConfig.TRANSITIONFROMPLAY2DEMOINODDLEVELS; // seconds

            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {
                    isOver = true;
                }
            }, delay);
        } else {
            isOver = true;
        }
        return isOver;
    }

    public boolean isDemoPlayOver() {
        if (animationActor != null && animationActor.getAge() < animationActor.getAnimation().getAnimationDuration()) {
            return false;
        }

        return true;
    }

    //<editor-fold desc="----------GetterSetters">
    public com.nabatfarsi.entity.Background getBackground() {
        if (gameLevel%2==1 & isDemoPlayOver()) {
            background = com.nabatfarsi.level.LevelGenerator.GeneratePatchBackground();
        }
        return background;
    }


    public com.nabatfarsi.entity.Player[] getPlayers() {
        return players;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public HashMap<com.nabatfarsi.entity.Player, Obstacle> getHashMap() {
        return hashMap;
    }

    public com.nabatfarsi.entity.Player getBird() {
        return bird;
    }

    public com.nabatfarsi.entity.CustomActor getPen_Left() {
        return pen_Left;
    }

    public com.nabatfarsi.entity.CustomActor getRePlay() {
        return rePlay;
    }

    public Group getGroup() {
        return group;
    }

    public int getGameLevel() {
        return gameLevel;
    }

    public com.nabatfarsi.entity.CustomActor getEndScene() {
        return endScene;
    }

    public com.nabatfarsi.entity.CustomActor getEndSceneFinal() {
        return endSceneFinal;
    }

    public com.nabatfarsi.entity.CustomActor getAnimationActor() {
        return animationActor;
    }

    public com.nabatfarsi.entity.CustomActor[] getConfetties() {
        return confetties;
    }

    public Music getBackroundMusic() {
        return BackroundMusic;
    }

    public Music getDemoMusic() {
        return DemoMusic;
    }

    public Music getCheerMusic() {
        return CheerMusic;
    }
    //</editor-fold>

    private void InitiateLevel() {
        switch (gameLevel) {
            case 0:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L1_ab(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L1AB_MUSIC);

                break;
            case 1:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L1AB_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L1MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L1_AB);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D1_ab(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D1_ab(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D1_ab(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D1_ab(assetManager), assetManager);
                break;
            case 2:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L2_baran(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L2BARAN_MUSIC);
                break;

            case 3:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L2BARAN_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L2MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L2_BARAN);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D2_baran(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D2_baran(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D2_baran(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D2_baran(assetManager), assetManager);
                break;
            case 4:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L3_prvanh(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L3PRVANH_MUSIC);
                break;
            case 5:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L3PRVANH_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L3MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L3_PRVANH);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D3_prvanh(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D3_prvanh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D3_prvanh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D3_prvanh(assetManager), assetManager);
                break;
            case 6:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L4_toop(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L4TOOP_MUSIC);
                break;
            case 7:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L4TOOP_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L4MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L4_TOOP);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new D4_toop(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new D4_toop(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new D4_toop(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new D4_toop(assetManager), assetManager);
                break;
            case 8:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L5_sanieh(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L5SANIEH_MUSIC);
                break;
            case 9:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L5SANIEH_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L5MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L5_SANIEH);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D5_sanieh(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D5_sanieh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D5_sanieh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D5_sanieh(assetManager), assetManager);
                break;
            case 10:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L6_jaroo(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L6JAROO_MUSIC);
                break;
            case 11:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L6JAROO_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L6MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L6_JAROO);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D6_jaroo(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D6_jaroo(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D6_jaroo(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D6_jaroo(assetManager), assetManager);
                break;
            case 12:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L7_chtr(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L7CHTR_MUSIC);
                break;
            case 13:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L7CHTR_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L7MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L7_CHTR);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D7_chtr(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D7_chtr(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D7_chtr(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D7_chtr(assetManager), assetManager);
                break;
            case 14:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L8_hobab(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L8HBAB_MUSIC);
                break;
            case 15:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L8HBAB_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L8MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L8_HOBAB);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D8_hobab(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D8_hobab(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D8_hobab(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D8_hobab(assetManager), assetManager);
                break;
            case 16:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L9_khorshid(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L9KHORSHID_MUSIC);
                break;
            case 17:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L9KHORSHID_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L9MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L9_KHORSHID);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new D9_khorshid(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new D9_khorshid(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new D9_khorshid(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new D9_khorshid(assetManager), assetManager);
                break;
            case 18:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L10_drakht(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L10DRKHT_MUSIC);
                break;
            case 19:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L10Drkht_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L10MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L10_DRAKHT);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D10_drkht(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D10_drkht(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D10_drkht(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D10_drkht(assetManager), assetManager);
                break;
            case 20:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L11_zrt(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L11ZRT_MUSIC);
                break;
            case 21:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L11ZRT_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L11MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L11_ZRT);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D11_zrt(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D11_zrt(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D11_zrt(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D11_zrt(assetManager), assetManager);
                break;
            case 22:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L12_rooznameh(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L12ROOZNAMH_MUSIC);
                break;
            case 23:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L12ROOZNAMH_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L12MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L12_ROOZNAMEH);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D12_rooznameh(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D12_rooznameh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D12_rooznameh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);

                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D12_rooznameh(assetManager), assetManager);
                break;
            case 24:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L13_zanboor(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L13ZNBOOR_MUSIC);
                break;
            case 25:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L13ZNBOOR_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L13MSG_MUSIC);

                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L13_ZANBOOR);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D13_zanboor(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D13_zanboor(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D13_zanboor(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D13_zanboor(assetManager), assetManager);
                break;
            case 26:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L14_jelle(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L14JLH_MUSIC);
                break;
            case 27:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L14JLH_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L14MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L14_JELE);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new D14_jelle(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new D14_jelle(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new D14_jelle(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new D14_jelle(assetManager), assetManager);
                break;
            case 28:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L15_sng(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L15SNG_MUSIC);
                break;
            case 29:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L15SNG_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L15MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L15_SNG);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D15_sng(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D15_sng(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D15_sng(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D15_sng(assetManager), assetManager);
                break;
            case 30:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L16_shalgardan(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L16SHAL_MUSIC);
                break;
            case 31:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L16SHAL_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L16MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L16_SHALGARDN);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D16_shalgardan(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D16_shalgardan(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D16_shalgardan(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D16_shalgardan(assetManager), assetManager);
                break;
            case 32:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L17_saboon(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L17SABOON_MUSIC);
                break;
            case 33:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L17SABOON_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L17MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L17_SABOON);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D17_saboon(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D17_saboon(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D17_saboon(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D17_saboon(assetManager), assetManager);
                break;
            case 34:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L18_zabt(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L18ZABT_MUSIC);
                break;
            case 35:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L18ZABT_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L18MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L18_ZABT);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D18_zabt(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D18_zabt(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D18_zabt(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D18_zabt(assetManager), assetManager);

                break;
            case 36:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L19_tabl(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L19TABL_MUSIC);
                break;
            case 37:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L19TABL_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L19MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L19_TABL);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D19_tabl(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D19_tabl(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D19_tabl(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D19_tabl(assetManager), assetManager);
                break;
            case 38:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L20_zarf(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L20ZRF_MUSIC);
                break;
            case 39:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L20ZRF_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L20MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L20_ZARF);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D20_zarf(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D20_zarf(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D20_zarf(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D20_zarf(assetManager), assetManager);
                break;
            case 40:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L21_einak(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L21EINK_MUSIC);
                break;
            case 41:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L21EINK_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L21MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L21_EINAK);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D21_einak(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D21_einak(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D21_einak(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D21_einak(assetManager), assetManager);
                break;
            case 42:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L22_ghavas(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L22GHVAS_MUSIC);
                break;
            case 43:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L22GHVAS_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L22MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L22_GHAVAS);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D22_ghavas(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D22_ghavas(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D22_ghavas(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D22_ghavas(assetManager), assetManager);
                break;
            case 44:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L23_fanoos(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L23FANOOS_MUSIC);
                break;
            case 45:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L23FANOOS_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L23MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L23_FANOOS);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D23_fanoos(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D23_fanoos(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D23_fanoos(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D23_fanoos(assetManager), assetManager);
                break;
            case 46:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L24_ghlm(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L24GHLM_MUSIC);
                break;
            case 47:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L24GHLM_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L24MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L24_GHLM);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D24_ghlm(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D24_ghlm(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D24_ghlm(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D24_ghlm(assetManager), assetManager);
                break;
            case 48:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L25_kif(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L25KIF_MUSIC);
                break;
            case 49:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L25KIF_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L25MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L25_KIF);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D25_kif(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D25_kif(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D25_kif(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D25_kif(assetManager), assetManager);
                break;
            case 50:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L26_goldan(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L26GOLDAN_MUSIC);
                break;
            case 51:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L26GOLDAN_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L26MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L26_GOLOLDAN);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D26_goldan(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D26_goldan(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D26_goldan(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D26_goldan(assetManager), assetManager);
                break;
            case 52:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L27_lnj(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L27LNJ_MUSIC);
                break;
            case 53:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L27LNJ_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L27MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L27_LENJ);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D27_lenj(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D27_lenj(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D27_lenj(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D27_lenj(assetManager), assetManager);
                break;
            case 54:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L28_mooshk(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L28MOOSHK_MUSIC);
                break;
            case 55:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L28MOOSHK_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L28MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L28_MOOSHAK);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D28_mooshak(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D28_mooshak(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D28_mooshak(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D28_mooshak(assetManager), assetManager);
                break;
            case 56:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L29_naghashi(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L29NGHASHI_MUSIC);
                break;
            case 57:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L29NGHASHI_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L29MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L29_NAGHASHI);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D29_naghashi(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D29_naghashi(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D29_naghashi(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D29_naghashi(assetManager), assetManager);
                break;
            case 58:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L30_vazneh(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L30VZNH_MUSIC);
                break;
            case 59:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L30VZNH_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L30MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L30_VAZNEH);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D30_vzneh(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D30_vzneh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D30_vzneh(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D30_vzneh(assetManager), assetManager);
                break;
            case 60:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new L31_hvapeima(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L31HVAPEIMA_MUSIC);

                break;
            case 61:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L31HVAPEIMA_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L31MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L31_HAVAPEIMA);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D31_havapeima(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D31_havapeima(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D31_havapeima(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D31_havapeima(assetManager), assetManager);
                break;
            case 62:
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap(new com.nabatfarsi.level.instances.L32_ikmak(assetManager), assetManager);
                wordMusic = assetManager.get(AssetDescriptors.L32IKHMK_MUSIC);
                break;
            case 63:
                DemoMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L32IKHMK_BACKGROUND_MUSIC);
                MsgMusic = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.L32MSG_MUSIC);
                gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L32_IKHMAK);
                hashMap = com.nabatfarsi.level.LevelGenerator.GenerateHashMap4Demo(new com.nabatfarsi.level.instances.D32_ikhmak(assetManager), assetManager);
                endScene = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D32_ikhmak(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_end);
                endSceneFinal = com.nabatfarsi.level.ActorGenerator.GenerateEndScene(new com.nabatfarsi.level.instances.D32_ikhmak(assetManager), com.nabatfarsi.assets.RegionNames.PLAYER_i_bg_final);
                animationActor = com.nabatfarsi.level.ActorGenerator.GenerateActor(new com.nabatfarsi.level.instances.D32_ikhmak(assetManager), assetManager);
                break;
        }
        //background = LevelGenerator.GenerateBackground();
        if (gameLevel % 2 == 1) {
            MsgMusic.setLooping(true);
            animationActor.setAge(animationActor.getAge() + Gdx.graphics.getDeltaTime());
            group.addActor(endScene);
            group.addActor(animationActor);
        } else {
            wordMusic.setLooping(true);
        }


        players = hashMap.keySet().toArray(new com.nabatfarsi.entity.Player[hashMap.size()]);
        obstacles = hashMap.values().toArray(new Obstacle[hashMap.size()]);

    }


    public com.nabatfarsi.entity.CustomActor getPen_Right() {
        return pen_Right;
    }

    public com.nabatfarsi.entity.CustomActor getMenu_icon() {
        return menu_icon;
    }

    public com.nabatfarsi.entity.CustomActor getExit_icon() {
        return exit_icon;
    }

    public com.nabatfarsi.entity.CustomActor getLeft_icon() {
        return left_icon;
    }


    public com.nabatfarsi.entity.CustomActor getRight_icon() {
        return right_icon;
    }

    public com.nabatfarsi.entity.CustomActor getPurchase_icon() {
        return purchase_icon;
    }

    public com.nabatfarsi.entity.CustomActor[] getMenues_actors() {
        return menues_actors;
    }


    public void setMenues_actors(com.nabatfarsi.entity.CustomActor[] menues_actors) {
        this.menues_actors = menues_actors;
    }

    public Music getMsgMusic() {
        return MsgMusic;
    }

    public Music getWordMusic() {
        return wordMusic;
    }
}
