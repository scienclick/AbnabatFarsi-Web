package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.AssetDescriptors;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L2_baran extends LevelBase {
    private static TextureAtlas gamePlayAtlas;


    public L2_baran(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L2_BARAN);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {




        return new Player[]{

                LetterFactory._b(gamePlayAtlas,assetManager),
                LetterFactory.a_(gamePlayAtlas,assetManager),
                LetterFactory.rr(gamePlayAtlas,assetManager),
                LetterFactory.aa(gamePlayAtlas,assetManager),
                LetterFactory.nn(gamePlayAtlas,assetManager)
        };




    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{

                LetterFactory._bo(gamePlayAtlas,assetManager),
                LetterFactory.a_o(gamePlayAtlas,assetManager),
                LetterFactory.rro(gamePlayAtlas,assetManager),
                LetterFactory.aao(gamePlayAtlas,assetManager),
                LetterFactory.nno(gamePlayAtlas,assetManager)
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
