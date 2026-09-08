package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.level.LetterFactory;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L3_prvanh extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L3_prvanh(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L3_PRVANH);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {

        return new Player[]{

                LetterFactory._p(gamePlayAtlas,assetManager),
                LetterFactory.r_(gamePlayAtlas,assetManager),
                LetterFactory.vv(gamePlayAtlas,assetManager),
                LetterFactory.aa(gamePlayAtlas,assetManager),
                LetterFactory._n(gamePlayAtlas,assetManager),
                LetterFactory.h_(gamePlayAtlas,assetManager),
        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{

                LetterFactory._po(gamePlayAtlas,assetManager),
                LetterFactory.r_o(gamePlayAtlas,assetManager),
                LetterFactory.vvo(gamePlayAtlas,assetManager),
                LetterFactory.aao(gamePlayAtlas,assetManager),
                LetterFactory._no(gamePlayAtlas,assetManager),
                LetterFactory.h_o(gamePlayAtlas,assetManager),
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
