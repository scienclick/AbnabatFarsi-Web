package com.nabatfarsi.level.instances;

import com.nabatfarsi.entity.Player;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.level.LetterFactory;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L23_fanoos extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L23_fanoos(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L23_FANOOS);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory._f(gamePlayAtlas,assetManager),
                LetterFactory.a_(gamePlayAtlas,assetManager),
                LetterFactory._n(gamePlayAtlas,assetManager),
                LetterFactory.v_(gamePlayAtlas,assetManager),
                LetterFactory.ss(gamePlayAtlas,assetManager),


        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._fo(gamePlayAtlas,assetManager),
                LetterFactory.a_o(gamePlayAtlas,assetManager),
                LetterFactory._no(gamePlayAtlas,assetManager),
                LetterFactory.v_o(gamePlayAtlas,assetManager),
                LetterFactory.sso(gamePlayAtlas,assetManager),
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
