package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L24_ghlm extends com.nabatfarsi.level.LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L24_ghlm(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L24_GHLM);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._fgh(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._l_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.m_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._fgho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._l_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.m_o(gamePlayAtlas,assetManager),
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
