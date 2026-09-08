package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L17_saboon extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L17_saboon(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L17_SABOON);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory._sad(gamePlayAtlas,assetManager),
                LetterFactory.a_(gamePlayAtlas,assetManager),
                LetterFactory._b(gamePlayAtlas,assetManager),
                LetterFactory.v_(gamePlayAtlas,assetManager),
                LetterFactory.nn(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._sado(gamePlayAtlas,assetManager),
                LetterFactory.a_o(gamePlayAtlas,assetManager),
                LetterFactory._bo(gamePlayAtlas,assetManager),
                LetterFactory.v_o(gamePlayAtlas,assetManager),
                LetterFactory.nno(gamePlayAtlas,assetManager),
        };


    }

    @Override
    protected CustomActor GenerateEndScene(String regionnam) {
        return null;
    }
    @Override
    protected CustomActor GenerateAnimatedActor(AssetManager assetManager) {
        return null;
    }


}
