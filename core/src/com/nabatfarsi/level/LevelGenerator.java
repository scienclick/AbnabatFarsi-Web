package com.nabatfarsi.level;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.assets.RegionNames;
import com.nabatfarsi.config.GameConfig;
import com.nabatfarsi.entity.Background;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;

import java.util.HashMap;


public class LevelGenerator {
    private static AssetManager assetManager;
    private static TextureAtlas gamePlayAtlas;

    private static com.nabatfarsi.entity.Player[] players;
    private static Obstacle[] obstacles;
    static LevelBase level;
    static com.nabatfarsi.entity.CustomActor endScene;


    public static HashMap<Player, Obstacle> GenerateHashMap(LevelBase L, AssetManager thisassetManager) {

        level = L;
        assetManager = thisassetManager;

        players = level.GeneratePlayerArray(assetManager);
        PositionPlayers(players);
        obstacles = level.GenerateObstacleArray(assetManager);
        PositionObsticales(obstacles, true);

        //HashMap
        HashMap hashMap = new HashMap<Player, Obstacle>();
        for (int i = 0; i < players.length; i++) {

            hashMap.put(players[i], obstacles[i]);
        }
        return hashMap;
    }

    public static HashMap<Player, Obstacle> GenerateHashMap4Demo(LevelBase L, AssetManager thisassetManager) {

        level = L;
        assetManager = thisassetManager;

        players = level.GeneratePlayerArray(assetManager);
        PositionPlayers(players);
        obstacles = level.GenerateObstacleArray(assetManager);
        //HashMap
        HashMap hashMap = new HashMap<Player, Obstacle>();
        for (int i = 0; i < players.length; i++) {
            hashMap.put(players[i], obstacles[i]);
        }
        //endScene = level.GenerateEndScene(assetManager);
        return hashMap;
    }


    public static Player GenerateBird(AssetManager thisassetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_GENERAL);
        Player bird = new com.nabatfarsi.entity.Player(GameConfig.BIRD_BOUNDS_RADIUS, GameConfig.BIRD_SIZE, GameConfig.BIRD_START_X, GameConfig.BIRD_START_y);

        String[] randombird = com.nabatfarsi.assets.RegionNames.Birds[MathUtils.random(0,3)];
        bird.setTextureRegion(gamePlayAtlas.findRegion(randombird[3]));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(randombird[0]);
        playertextures[1] = gamePlayAtlas.findRegion(randombird[1]);
        playertextures[2] = gamePlayAtlas.findRegion(randombird[2]);
        bird.setTextureRegions(playertextures);

        //bird.setPosition(GameConfig.BIRD_START_X, GameConfig.BIRD_START_y);
        return bird;

    }


    public static Background GenerateBackground() {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_GENERAL);
        com.nabatfarsi.entity.Background bg = new com.nabatfarsi.entity.Background(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.BACKGROUND));
        bg.setPosition(0, 0);
        bg.setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
        return bg;

    }
    public static Background GeneratePatchBackground() {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_GENERAL);
        com.nabatfarsi.entity.Background bg = new com.nabatfarsi.entity.Background(gamePlayAtlas.findRegion(RegionNames.BG0_loading));
        bg.setPosition(0, 0);
        bg.setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
        return bg;

    }



    public static Background GenerateBackground(TextureRegion tr) {
        com.nabatfarsi.entity.Background bg = new com.nabatfarsi.entity.Background(tr);
        bg.setPosition(0, 0);
        bg.setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
        return bg;

    }

    private static void PositionObsticales(Obstacle[] obstacles, boolean centered) {

        float width_center = GameConfig.WORLD_WIDTH / 2;
        float height_center = GameConfig.WORLD_HEIGHT / 2;
        float wordsWorldHeight = GameConfig.OBSTACLE_SIZE;//World units

        float wordsLength = 0;

        for (int i = 0; i < obstacles.length; i++) {
            wordsLength += wordsWorldHeight * (float) obstacles[i].getWidth() / obstacles[i].getHeight();//World units
        }
        float initialy = height_center - wordsWorldHeight / 2;
        float initialx = width_center + wordsLength / 2;

        float wordWorldWidth = 0;//wordsWorldHeight* (float) obstacles[0].getWidth() / obstacles[0].getHeight() ;//World units
        float offset = 0;
        for (int i = 0; i < obstacles.length; i++) {
            wordWorldWidth = wordsWorldHeight * (float) obstacles[i].getWidth() / obstacles[i].getHeight();//World units
            offset += wordWorldWidth;
            if (!centered) {

                initialx = MathUtils.random(0, GameConfig.WORLD_WIDTH - wordWorldWidth);

                initialy = MathUtils.random(0, GameConfig.WORLD_HEIGHT - wordsWorldHeight);
            }
            obstacles[i].setPosition(initialx - offset, initialy);
        }

    }

    private static void PositionPlayers(com.nabatfarsi.entity.Player[] players) {

        float ddx = GameConfig.WORLD_WIDTH / 7f;
        float ddy = GameConfig.WORLD_HEIGHT / 5f;

        switch (players.length) {
            case 2:
                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));
                return;
            case 3:
                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));

                players[2].setPosition(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f));
                players[2].setDestination(new Vector2(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f)));
                return;
            case 4:

                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));

                players[2].setPosition(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f));
                players[2].setDestination(new Vector2(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f)));

                players[3].setPosition(1.5f, MathUtils.random(2f, 3f));
                players[3].setDestination(new Vector2(1.5f, MathUtils.random(2f, 3f)));

                return;

            case 5:
                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));

                players[2].setPosition(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f));
                players[2].setDestination(new Vector2(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f)));

                players[3].setPosition(1.5f, MathUtils.random(2f, 3f));
                players[3].setDestination(new Vector2(1.5f, MathUtils.random(2f, 3f)));

                players[4].setPosition(8.5f, MathUtils.random(2f, 3f));
                players[4].setDestination(new Vector2(8.5f, MathUtils.random(2f, 3f)));
                return;

            case 6:
                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));

                players[2].setPosition(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f));
                players[2].setDestination(new Vector2(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f)));

                players[3].setPosition(1.5f, MathUtils.random(2f, 3f));
                players[3].setDestination(new Vector2(1.5f, MathUtils.random(2f, 3f)));

                players[4].setPosition(8.5f, MathUtils.random(2f, 3f));
                players[4].setDestination(new Vector2(8.5f, MathUtils.random(2f, 3f)));

                players[5].setPosition(1f, MathUtils.random(1f, 1.5f));
                players[5].setDestination(new Vector2(1f, MathUtils.random(1f, 1.5f)));
                return;

            case 7:
                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));

                players[2].setPosition(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f));
                players[2].setDestination(new Vector2(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f)));

                players[3].setPosition(1.5f, MathUtils.random(2f, 3f));
                players[3].setDestination(new Vector2(1.5f, MathUtils.random(2f, 3f)));

                players[4].setPosition(8.5f, MathUtils.random(2f, 3f));
                players[4].setDestination(new Vector2(8.5f, MathUtils.random(2f, 3f)));

                players[5].setPosition(1f, MathUtils.random(1f, 1.5f));
                players[5].setDestination(new Vector2(1f, MathUtils.random(1f, 1.5f)));

                players[6].setPosition(8f, MathUtils.random(1f, 1.5f));
                players[6].setDestination(new Vector2(8f, MathUtils.random(1f, 1.5f)));
                return;

            case 8:
                players[0].setPosition(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f));
                players[0].setDestination(new Vector2(MathUtils.random(1, 2), MathUtils.random(3f, 3.1f)));
                players[1].setPosition(7.5f, MathUtils.random(3f, 3.1f));
                players[1].setDestination(new Vector2(7.5f, MathUtils.random(3f, 3.1f)));

                players[2].setPosition(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f));
                players[2].setDestination(new Vector2(MathUtils.random(4, 5), MathUtils.random(2.5f, 3.5f)));

                players[3].setPosition(1.5f, MathUtils.random(2f, 3f));
                players[3].setDestination(new Vector2(1.5f, MathUtils.random(2f, 3f)));

                players[4].setPosition(8.5f, MathUtils.random(2f, 3f));
                players[4].setDestination(new Vector2(8.5f, MathUtils.random(2f, 3f)));

                players[5].setPosition(1f, MathUtils.random(1f, 1.5f));
                players[5].setDestination(new Vector2(1f, MathUtils.random(1f, 1.5f)));

                players[6].setPosition(8f, MathUtils.random(1f, 1.5f));
                players[6].setDestination(new Vector2(8f, MathUtils.random(1f, 1.5f)));

                players[7].setPosition(5f, MathUtils.random(1f, 1.5f));
                players[7].setDestination(new Vector2(5f, MathUtils.random(1f, 1.5f)));
            default:

        }

        float dx = 0;
        if (players.length == 2 | players.length == 3 | players.length == 4) {
            dx = 8;
        } else if (players.length == 4 | players.length == 5 | players.length == 6) {
            dx = 4.5f;
        } else {
            dx = 2.25f;
        }
        int k = 0;

        for (int i = 0; i < GameConfig.WORLD_WIDTH - 1; i += dx) {


            if (players.length == 2) {
                int j = 1;
                if (k < players.length) {


                    float x = i + MathUtils.random(-2f, .2f);
                    float y = j + MathUtils.random(1f, 2f);
                    x = MathUtils.clamp(x, 1, GameConfig.WORLD_WIDTH - players[k].getWidth());
                    y = MathUtils.clamp(y, 0, GameConfig.WORLD_HEIGHT - GameConfig.PLAYER_SIZE);
                    //y = MathUtils.clamp(y, 0, GameConfig.WORLD_HEIGHT - players[k].getHeight());

                    players[k].setPosition(x, y);
                    players[k].setOrigin(new Vector2(x, y));
                    players[k].setDestination(new Vector2(x, y));
                    k++;
                }
            } else {
                k = 0;
                for (int j = 0; j < GameConfig.WORLD_HEIGHT; j += 4) {


                    if (players.length == 2) {
                        j = 1;
                        if (k < players.length) {


                            float x = i + MathUtils.random(-2f, .2f);
                            float y = j - MathUtils.random(-1f, 1f);
                            x = MathUtils.clamp(x, 1, GameConfig.WORLD_WIDTH - players[k].getWidth());
                            y = MathUtils.clamp(y, 0, GameConfig.WORLD_HEIGHT - GameConfig.PLAYER_SIZE);
                            //y = MathUtils.clamp(y, 0, GameConfig.WORLD_HEIGHT - players[k].getHeight());

                            players[k].setPosition(x, y);
                            players[k].setOrigin(new Vector2(x, y));
                            players[k].setDestination(new Vector2(x, y));
                            k++;

                        }
                    }
                }
            }
        }
    }


}
