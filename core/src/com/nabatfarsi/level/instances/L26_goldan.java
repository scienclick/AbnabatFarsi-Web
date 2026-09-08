package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L26_goldan extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L26_goldan(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L26_GOLOLDAN);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._g(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._l_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.d_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.aa(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.nn(gamePlayAtlas,assetManager),


        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._go(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._l_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.d_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.aao(gamePlayAtlas,assetManager),
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
