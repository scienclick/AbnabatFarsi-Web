package com.nabatfarsi.level.instances;

import com.nabatfarsi.assets.RegionNames;
import com.nabatfarsi.config.DemoObsticlePositions;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;
import com.nabatfarsi.level.LevelBase;
import com.nabatfarsi.level.WordFactory;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.nabatfarsi.config.GameConfig;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class D1_ab extends LevelBase {
    private static TextureAtlas gamePlayAtlas;
    private static TextureAtlas gamePlayAtlas2;
    private static AssetManager assetManager;


    public D1_ab(AssetManager assetManager) {
        gamePlayAtlas = assetManager.get(AssetDescriptors.GAME_PLAY_L1_AB);
        gamePlayAtlas2 = assetManager.get(AssetDescriptors.GAME_PLAY_GENERAL);
        assetManager = assetManager;
    }


    @Override
    protected Player[] GeneratePlayerArray(AssetManager assetManager) {
        Player p2 = WordFactory.baba(gamePlayAtlas, assetManager);
        Player p1 = WordFactory.gol(gamePlayAtlas, assetManager);
        Player p3 = WordFactory.ab(gamePlayAtlas, assetManager);


        return new Player[]{p1,
                p2,
                p3,
        };

    }

    @Override
    protected Obstacle[] GenerateObstacleArray(AssetManager assetManager) {

        Obstacle o1 = new Obstacle();
        Obstacle o2 = new Obstacle();
        Obstacle o3 = new Obstacle();
        o1.setTempTextureRegion(gamePlayAtlas2.findRegion(RegionNames.BALLOON));
        o2.setTempTextureRegion(gamePlayAtlas2.findRegion(RegionNames.BALLOON));
        o3.setTempTextureRegion(gamePlayAtlas2.findRegion(RegionNames.BALLOON));

        o2.setPosition(DemoObsticlePositions.D1_BABA_X, DemoObsticlePositions.D1_BABA_Y);

        o1.setPosition(DemoObsticlePositions.D1_GOL_X, DemoObsticlePositions.D1_GOL_Y);


        o3.setPosition(DemoObsticlePositions.D1_AB_X, DemoObsticlePositions.D1_AB_Y);
        Obstacle[] o = new Obstacle[]{o1, o2, o3};
        return o;
    }

    @Override
    protected com.nabatfarsi.entity.CustomActor GenerateEndScene(String regionname) {
        TextureRegion textureRegion = gamePlayAtlas2.findRegion(regionname);
        if (textureRegion==null) {
            textureRegion = gamePlayAtlas.findRegion(regionname);
        }
        final com.nabatfarsi.entity.CustomActor endScene = new com.nabatfarsi.entity.CustomActor(textureRegion);
        endScene.setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
        endScene.setPosition(0, 0);

        return endScene;
    }

    @Override
    protected com.nabatfarsi.entity.CustomActor GenerateAnimatedActor(AssetManager assetManager) {
        TextureRegion textureRegion = gamePlayAtlas.findRegion(RegionNames.PLAYER_i_ab0);

        com.nabatfarsi.entity.CustomActor customActor = new com.nabatfarsi.entity.CustomActor(textureRegion);
        customActor.setSize(GameConfig.WORLD_WIDTH, GameConfig.WORLD_HEIGHT);
        customActor.setPosition(0, 0);

        TextureRegion[] Actortextures = new TextureRegion[]{
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame1),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame2),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame3),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame4),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame5),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame6),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame7),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame8),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame9),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame10),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame11),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame12),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame13),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame14),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame15),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame16),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame17),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame18),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame19),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame20),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame21),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame22),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame23),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame24),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame25),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame26),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame27),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame28),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame29),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame30),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame31),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame32),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame33),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame34),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame35),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame36),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame37),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame38),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame39),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame40),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame41),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame42),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame43),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame44),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame45),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame46),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame47),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame48),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame49),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame50),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame51),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame52),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame53),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame54),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame55),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame56),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame57),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame58),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame59),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame60),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame61),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame62),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame63),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame64),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame65),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame66),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame67),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame68),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame69),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame70),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame71),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame72),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame73),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame74),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame75),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame76),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame77),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame78),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame79),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame80),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame81),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame82),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame83),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame84),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame85),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame86),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame87),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame88),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame89),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame90),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame91),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame92),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame93),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame94),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame95),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame96),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame97),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame98),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame99),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame100),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame101),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame102),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame103),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame104),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame105),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame106),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame107),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame108),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame109),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame110),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame111),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame112),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame113),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame114),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame115),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame116),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame117),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame118),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame119),
                gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_frame120)



        };

        customActor.setTextureRegions(Actortextures);


        customActor.setAnimation(new Animation(com.nabatfarsi.config.GameAnimationConfig.DEMO_LAG_TIME6, Actortextures));

        return customActor;
    }


}
