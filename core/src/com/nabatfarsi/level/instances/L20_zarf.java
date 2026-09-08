package com.nabatfarsi.level.instances;

import com.nabatfarsi.entity.Player;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.entity.CustomActor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L20_zarf extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L20_zarf(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L20_ZARF);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {


        return new Player[]{
                LetterFactory._za(gamePlayAtlas,assetManager),
                LetterFactory.r_(gamePlayAtlas,assetManager),
                LetterFactory.ff(gamePlayAtlas,assetManager),

        };


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._zao(gamePlayAtlas,assetManager),
                LetterFactory.r_o(gamePlayAtlas,assetManager),
                LetterFactory.ffo(gamePlayAtlas,assetManager),
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
