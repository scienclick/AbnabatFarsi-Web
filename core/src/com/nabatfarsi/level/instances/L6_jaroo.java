package com.nabatfarsi.level.instances;

import com.nabatfarsi.entity.CustomActor;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;
import com.nabatfarsi.assets.AssetDescriptors;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L6_jaroo extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L6_jaroo(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L6_JAROO);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {

        return new Player[]{

                LetterFactory._j(gamePlayAtlas,assetManager),
                LetterFactory.a_(gamePlayAtlas,assetManager),
                LetterFactory.rr(gamePlayAtlas,assetManager),
                LetterFactory.vv(gamePlayAtlas,assetManager)};


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{

                LetterFactory._jo(gamePlayAtlas,assetManager),
                LetterFactory.a_o(gamePlayAtlas,assetManager),
                LetterFactory.rro(gamePlayAtlas,assetManager),
                LetterFactory.vvo(gamePlayAtlas,assetManager)};

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
