package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L10_drakht extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L10_drakht(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L10_DRAKHT);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory.dd(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.rr(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._kh(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.t_(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory.ddo(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.rro(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._kho(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.t_o(gamePlayAtlas,assetManager),
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
