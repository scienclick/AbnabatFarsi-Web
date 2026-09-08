package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L4_toop extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L4_toop(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L4_TOOP);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {

        return new com.nabatfarsi.entity.Player[]{

                com.nabatfarsi.level.LetterFactory._t(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.pp(gamePlayAtlas,assetManager)};


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{

                com.nabatfarsi.level.LetterFactory._to(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.v_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.ppo(gamePlayAtlas,assetManager)};

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
