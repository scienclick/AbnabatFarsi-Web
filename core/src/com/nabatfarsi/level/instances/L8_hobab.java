package com.nabatfarsi.level.instances;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L8_hobab extends com.nabatfarsi.level.LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L8_hobab(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(com.nabatfarsi.assets.AssetDescriptors.GAME_PLAY_L8_HOBAB);
    }

    @Override
    protected com.nabatfarsi.entity.Player[] GeneratePlayerArray(AssetManager assetManager) {
        return new com.nabatfarsi.entity.Player[]{
                com.nabatfarsi.level.LetterFactory._ha(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._b_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.bb(gamePlayAtlas,assetManager)
        };

    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                com.nabatfarsi.level.LetterFactory._hao(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory._b_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.a_o(gamePlayAtlas,assetManager),
                com.nabatfarsi.level.LetterFactory.bbo(gamePlayAtlas,assetManager)
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
