package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L13_zanboor extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L13_zanboor(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L13_ZANBOOR);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory.zz(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._n(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._b_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.rr(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory.zzo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._no(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._b_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.rro(gamePlayAtlas,assetManager),
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
