package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.CustomActor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L27_lnj extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L27_lnj(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L27_LENJ);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory._l(gamePlayAtlas,assetManager),
                LetterFactory._n_(gamePlayAtlas,assetManager),
                LetterFactory.j_(gamePlayAtlas,assetManager),


        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._lo(gamePlayAtlas,assetManager),
                LetterFactory._n_o(gamePlayAtlas,assetManager),
                LetterFactory.j_o(gamePlayAtlas,assetManager),
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
