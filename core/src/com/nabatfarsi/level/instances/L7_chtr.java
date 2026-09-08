package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L7_chtr extends com.nabatfarsi.level.LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L7_chtr(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L7_CHTR);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {
        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._ch(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._t_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.r_(gamePlayAtlas,assetManager)};

    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._cho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._t_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.r_o(gamePlayAtlas,assetManager)};



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
