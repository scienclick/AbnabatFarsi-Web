package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L22_ghavas extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L22_ghavas(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L22_GHAVAS);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                com.nabatfarsi.level.LetterFactory._gh(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.aa(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.sad(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._gho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.aao(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.sado(gamePlayAtlas,assetManager),
        };


    }

    @Override
    protected com.nabatfarsi.entity.CustomActor GenerateEndScene(String regionnam) {
        return null;
    }
    @Override
    protected com.nabatfarsi.entity.CustomActor GenerateAnimatedActor(AssetManager assetManager) {
        return null;
    }


}
