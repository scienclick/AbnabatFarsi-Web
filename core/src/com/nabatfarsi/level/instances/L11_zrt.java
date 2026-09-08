package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L11_zrt extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L11_zrt(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L11_ZRT);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                com.nabatfarsi.level.LetterFactory.zal(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.rr(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.tt(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory.zalo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.rro(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.tto(gamePlayAtlas,assetManager),
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
