package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L30_vazneh extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L30_vazneh(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L30_VAZNEH);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory.vv(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.zz(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._n(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.h_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory.vvo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.zzo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._no(gamePlayAtlas,assetManager),
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
