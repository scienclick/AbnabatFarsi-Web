package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L31_hvapeima extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L31_hvapeima(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L31_HAVAPEIMA);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._h(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.aa(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._p(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._i_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._m_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._ho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.aao(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._po(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._i_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._m_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_o(gamePlayAtlas,assetManager),
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
