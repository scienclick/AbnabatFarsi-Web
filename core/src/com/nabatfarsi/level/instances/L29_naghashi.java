package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L29_naghashi extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L29_naghashi(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L29_NAGHASHI);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                com.nabatfarsi.level.LetterFactory._n(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._fgh_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._sh(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.i_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._no(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._fgh_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._sho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.i_o(gamePlayAtlas,assetManager),
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
