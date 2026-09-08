package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L5_sanieh extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L5_sanieh(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L5_SANIEH);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {

        return new com.nabatfarsi.entity.Player[]{

                LetterFactory._s3(gamePlayAtlas,assetManager),
                LetterFactory.a_(gamePlayAtlas,assetManager),
                LetterFactory._n(gamePlayAtlas,assetManager),
                LetterFactory._i_(gamePlayAtlas,assetManager),
                LetterFactory.h_(gamePlayAtlas,assetManager)};


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{

                LetterFactory._s3o(gamePlayAtlas,assetManager),
                LetterFactory.a_o(gamePlayAtlas,assetManager),
                LetterFactory._no(gamePlayAtlas,assetManager),
                LetterFactory._i_o(gamePlayAtlas,assetManager),
                LetterFactory.h_o(gamePlayAtlas,assetManager)};

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
