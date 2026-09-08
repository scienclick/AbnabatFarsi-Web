package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L12_rooznameh extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L12_rooznameh(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L12_ROOZNAMEH);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory.rr(gamePlayAtlas,assetManager),
                LetterFactory.vv(gamePlayAtlas,assetManager),
                LetterFactory.zz(gamePlayAtlas,assetManager),
                LetterFactory._n(gamePlayAtlas,assetManager),
                LetterFactory.a_(gamePlayAtlas,assetManager),
                LetterFactory._m(gamePlayAtlas,assetManager),
                LetterFactory.h_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory.rro(gamePlayAtlas,assetManager),
                LetterFactory.vvo(gamePlayAtlas,assetManager),
                LetterFactory.zzo(gamePlayAtlas,assetManager),
                LetterFactory._no(gamePlayAtlas,assetManager),
                LetterFactory.a_o(gamePlayAtlas,assetManager),
                LetterFactory._mo(gamePlayAtlas,assetManager),
                LetterFactory.h_o(gamePlayAtlas,assetManager),
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
