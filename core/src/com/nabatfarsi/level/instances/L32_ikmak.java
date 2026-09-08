package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.level.LetterFactory;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L32_ikmak extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L32_ikmak(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L32_IKHMAK);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory._i(gamePlayAtlas,assetManager),
                LetterFactory._kh_(gamePlayAtlas,assetManager),
                LetterFactory._m_(gamePlayAtlas,assetManager),
                LetterFactory.k_(gamePlayAtlas,assetManager),


        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._io(gamePlayAtlas,assetManager),
                LetterFactory._kh_o(gamePlayAtlas,assetManager),
                LetterFactory._m_o(gamePlayAtlas,assetManager),
                LetterFactory.k_o(gamePlayAtlas,assetManager),
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
