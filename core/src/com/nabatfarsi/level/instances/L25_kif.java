package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L25_kif extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L25_kif(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L25_KIF);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory._k(gamePlayAtlas,assetManager),
                LetterFactory._i_(gamePlayAtlas,assetManager),
                LetterFactory.f_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._ko(gamePlayAtlas,assetManager),
                LetterFactory._i_o(gamePlayAtlas,assetManager),
                LetterFactory.f_o(gamePlayAtlas,assetManager),
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
