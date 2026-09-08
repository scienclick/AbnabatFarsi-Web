package com.nabatfarsi.level.instances;

import com.nabatfarsi.entity.CustomActor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Logger;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LetterFactory;
import com.nabatfarsi.level.LevelBase;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class L9_khorshid extends LevelBase {
    private static TextureAtlas gamePlayAtlas;

private static final Logger log=new Logger(L9_khorshid.class.getCanonicalName(), Logger.DEBUG);

    public L9_khorshid(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L9_KHORSHID);
    }

    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {
        Player[] khorshid={
                LetterFactory._kh(gamePlayAtlas,assetManager),
                LetterFactory.v_(gamePlayAtlas,assetManager),
                LetterFactory.rr(gamePlayAtlas,assetManager),
                LetterFactory._sh(gamePlayAtlas,assetManager),
                LetterFactory._i_(gamePlayAtlas,assetManager),
                LetterFactory.d_(gamePlayAtlas,assetManager)

        };

        return khorshid;


    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        return new Obstacle[]{
                LetterFactory._kho(gamePlayAtlas,assetManager),
                LetterFactory.v_o(gamePlayAtlas,assetManager),
                LetterFactory.rro(gamePlayAtlas,assetManager),
                LetterFactory._sho(gamePlayAtlas,assetManager),
                LetterFactory._i_o(gamePlayAtlas,assetManager),
                LetterFactory.d_o(gamePlayAtlas,assetManager)
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
