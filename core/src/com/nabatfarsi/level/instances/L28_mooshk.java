package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L28_mooshk extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L28_mooshk(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L28_MOOSHAK);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                LetterFactory._m(gamePlayAtlas,assetManager),
                LetterFactory.v_(gamePlayAtlas,assetManager),
                LetterFactory._sh(gamePlayAtlas,assetManager),
                LetterFactory.k_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._mo(gamePlayAtlas,assetManager),
                LetterFactory.v_o(gamePlayAtlas,assetManager),
                LetterFactory._sho(gamePlayAtlas,assetManager),
                LetterFactory.k_o(gamePlayAtlas,assetManager),
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
