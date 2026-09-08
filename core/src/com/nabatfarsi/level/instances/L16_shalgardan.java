package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L16_shalgardan extends com.nabatfarsi.level.LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L16_shalgardan(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L16_SHALGARDN);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._sh(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.ll(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._g(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.r_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.dd(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.nn(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected com.nabatfarsi.entity.Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new com.nabatfarsi.entity.Obstacle[]{
                com.nabatfarsi.level.LetterFactory._sho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.llo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._go(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.r_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.ddo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.nno(gamePlayAtlas,assetManager),
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
