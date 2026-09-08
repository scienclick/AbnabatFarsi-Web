package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L21_einak extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L21_einak(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L21_EINAK);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._ain(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._i_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._n_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.k_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._aino(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._i_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._n_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.k_o(gamePlayAtlas,assetManager),
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
