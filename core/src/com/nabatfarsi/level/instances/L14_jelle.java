package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L14_jelle extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L14_jelle(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L14_JELE);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory.jh(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._l(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.h_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory.jho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._lo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.h_o(gamePlayAtlas,assetManager),
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
