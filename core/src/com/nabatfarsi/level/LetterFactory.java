package com.nabatfarsi.level;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.entity.Obstacle;

/**
 * Created by AShamsa on 12/6/2017.
 */

public class LetterFactory {
    private static TextureAtlas gamePlayAtlas;

    //aa
    public static com.nabatfarsi.entity.Player aaa(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERaaa));
        TextureRegion[] playertextures = new TextureRegion[1];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERaaa);
        p.setTextureRegions(playertextures);
        
        
        p.setSound(assetManager.get(AssetDescriptors.AA_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player aa(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERaa));
        TextureRegion[] playertextures = new TextureRegion[1];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERaa);
        p.setTextureRegions(playertextures);


        p.setSound(assetManager.get(AssetDescriptors.AA_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player a_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERa_));
        TextureRegion[] playertextures = new TextureRegion[4];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERa_);

        p.setSound(assetManager.get(AssetDescriptors.AA_MUSIC));


        p.setTextureRegions(playertextures);
        return p;
    }


    public static Obstacle aaao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEaaao));
        return o;
    }

    public static Obstacle aao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERaao));
        return o;
    }

    public static Obstacle a_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEa_o));
        return o;
    }


    //bb
    public static com.nabatfarsi.entity.Player _b(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_b));
        TextureRegion[] playertextures = new TextureRegion[1];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_b);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.BB_MUSIC));

        return p;
    }

    public static com.nabatfarsi.entity.Player _b_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_b_));
        TextureRegion[] playertextures = new TextureRegion[1];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_b_);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.BB_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player b_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERb_));
        TextureRegion[] playertextures = new TextureRegion[1];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERb_);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.BB_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player bb(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERbb));
        TextureRegion[] playertextures = new TextureRegion[1];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERbb);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.BB_MUSIC));
        return p;
    }

    public static Obstacle _bo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_bo));
        return o;
    }

    public static Obstacle _b_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_b_o));
        return o;
    }

    public static Obstacle b_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEb_o));
        return o;
    }

    public static Obstacle bbo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEbbo));
        return o;
    }

    //pp
    public static com.nabatfarsi.entity.Player _p(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERp_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERpp);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.PP_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player _p_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERp_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERpp);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.PP_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player p_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERp_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERp_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERp_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERpp);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.PP_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player pp(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERpp));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERpp);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERpp);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERp_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_p_);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.PP_MUSIC));
        return p;
    }

    public static Obstacle _po(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_po));
        return o;
    }

    public static Obstacle _p_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_p_o));
        return o;
    }

    public static Obstacle p_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEp_o));
        return o;
    }

    public static Obstacle ppo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEppo));
        return o;
    }


//tt


    public static com.nabatfarsi.entity.Player _t(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERt_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERtt);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.TT_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player _t_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERt_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERtt);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.TT_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player t_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERt_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERt_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERt_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERtt);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.TT_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player tt(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERtt));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERtt);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERtt);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERt_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_t_);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.TT_MUSIC));
        return p;
    }

    public static Obstacle _to(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_to));
        return o;
    }

    public static Obstacle _t_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_t_o));
        return o;
    }

    public static Obstacle t_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEt_o));
        return o;
    }

    public static Obstacle tto(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEtto));
        return o;
    }

    //s3
    public static com.nabatfarsi.entity.Player _s3(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.S3_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player _s3_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.S3_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player s3_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.S3_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player s3(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs3_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s3_);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.S3_MUSIC));
        return p;
    }

    public static Obstacle _s3o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_s3o));
        return o;
    }

    public static Obstacle _s3_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_s3_o));
        return o;
    }

    public static Obstacle s3_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEs3_o));
        return o;
    }

    public static Obstacle s3o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEs3o));
        return o;
    }

    //d


    public static com.nabatfarsi.entity.Player d_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERd_));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERd_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERd_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERdd);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.DD_MUSIC));

        return p;
    }

    public static com.nabatfarsi.entity.Player dd(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERdd));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERdd);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERdd);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERd_);

        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.DD_MUSIC));
        return p;
    }

    public static Obstacle d_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEd_o));
        return o;
    }

    public static Obstacle ddo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEddo));
        return o;
    }

    //zal
    public static com.nabatfarsi.entity.Player zal_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal_));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.ZAL_MUSIC));


        return p;
    }

    public static com.nabatfarsi.entity.Player zal(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzal_);

        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.ZAL_MUSIC));

        return p;
    }

    public static Obstacle zal_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEzal_o));
        return o;
    }

    public static Obstacle zalo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEzalo));
        return o;
    }

    //r
    public static com.nabatfarsi.entity.Player r_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERr_));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERr_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERr_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERrr);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.RR_MUSIC));

        return p;
    }

    public static com.nabatfarsi.entity.Player rr(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERrr));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERrr);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERrr);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERr_);

        p.setTextureRegions(playertextures);


        p.setSound(assetManager.get(AssetDescriptors.RR_MUSIC));
        return p;
    }

    public static Obstacle r_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEr_o));


        return o;
    }

    public static Obstacle rro(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLErro));


        return o;
    }

    //z
    public static com.nabatfarsi.entity.Player z_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERz_));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERz_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERz_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzz);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.ZZ_MUSIC));


        return p;
    }

    public static com.nabatfarsi.entity.Player zz(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzz));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzz);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzz);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERz_);

        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.ZZ_MUSIC));

        return p;
    }

    public static Obstacle z_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEz_o));
        return o;
    }

    public static Obstacle zzo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEzzo));
        return o;
    }

    //jh
    public static com.nabatfarsi.entity.Player jh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh_));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh);
        p.setTextureRegions(playertextures);


        p.setSound(assetManager.get(AssetDescriptors.JH_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player jh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjh_);

        p.setTextureRegions(playertextures);


        p.setSound(assetManager.get(AssetDescriptors.JH_MUSIC));
        return p;
    }

    public static Obstacle jh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEjh_o));
        return o;
    }

    public static Obstacle jho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEjho));
        return o;
    }

    //j
    public static com.nabatfarsi.entity.Player _j(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERj_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjj);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.JJ_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player _j_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERj_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjj);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.JJ_MUSIC));

        return p;
    }

    public static com.nabatfarsi.entity.Player j_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERj_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERj_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERj_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjj);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.JJ_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player jj(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjj));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjj);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERjj);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERj_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_j_);
        p.setTextureRegions(playertextures);
        p.setSound(assetManager.get(AssetDescriptors.JJ_MUSIC));

        return p;
    }

    public static Obstacle _jo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_jo));
        return o;
    }

    public static Obstacle _j_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_j_o));
        return o;
    }

    public static Obstacle j_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEj_o));
        return o;
    }

    public static Obstacle jjo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEjjo));
        return o;
    }


    //ch
    public static com.nabatfarsi.entity.Player _ch(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.CH_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player _ch_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.CH_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player ch_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.CH_MUSIC));
        return p;
    }

    public static com.nabatfarsi.entity.Player ch(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERch_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ch_);
        p.setTextureRegions(playertextures);

        p.setSound(assetManager.get(AssetDescriptors.CH_MUSIC));
        return p;
    }

    public static Obstacle _cho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_cho));
        return o;
    }

    public static Obstacle _ch_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_ch_o));
        return o;
    }

    public static Obstacle ch_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEch_o));
        return o;
    }

    public static Obstacle cho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEcho));
        return o;
    }


    //ha

    public static com.nabatfarsi.entity.Player _ha(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha);
        p.setSound(assetManager.get(AssetDescriptors.HA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _ha_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha);
        p.setSound(assetManager.get(AssetDescriptors.HA_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ha_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha);

        p.setSound(assetManager.get(AssetDescriptors.HA_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ha(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERha_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ha_);

        p.setSound(assetManager.get(AssetDescriptors.HA_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _hao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_hao));
        return o;
    }

    public static Obstacle _ha_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_ha_o));
        return o;
    }

    public static Obstacle ha_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEha_o));
        return o;
    }

    public static Obstacle hao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEhao));
        return o;
    }

    //kh
    public static com.nabatfarsi.entity.Player _kh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh);

        p.setSound(assetManager.get(AssetDescriptors.KH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _kh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh);

        p.setSound(assetManager.get(AssetDescriptors.KH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player kh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh);

        p.setSound(assetManager.get(AssetDescriptors.KH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player kh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_kh_);

        p.setSound(assetManager.get(AssetDescriptors.KH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _kho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_kho));
        return o;
    }

    public static Obstacle _kh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_kh_o));
        return o;
    }

    public static Obstacle kh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEkh_o));
        return o;
    }

    public static Obstacle kho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEkho));
        return o;
    }

    //s
    public static com.nabatfarsi.entity.Player _s(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERss);
        p.setSound(assetManager.get(AssetDescriptors.SS_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _s_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERss);
        p.setSound(assetManager.get(AssetDescriptors.SS_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player s_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERss);
        p.setSound(assetManager.get(AssetDescriptors.SS_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ss(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERss));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERss);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERss);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERs_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_s_);
        p.setSound(assetManager.get(AssetDescriptors.SS_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _so(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_so));

        return o;
    }

    public static Obstacle _s_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_s_o));

        return o;
    }

    public static Obstacle s_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEs_o));

        return o;
    }

    public static Obstacle sso(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEsso));

        return o;
    }

    //sh
    public static com.nabatfarsi.entity.Player _sh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh);
        p.setSound(assetManager.get(AssetDescriptors.SH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _sh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh);
        p.setSound(assetManager.get(AssetDescriptors.SH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player sh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh);
        p.setSound(assetManager.get(AssetDescriptors.SH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player sh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sh_);
        p.setSound(assetManager.get(AssetDescriptors.SH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _sho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_sho));

        return o;
    }

    public static Obstacle _sh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_sh_o));

        return o;
    }

    public static Obstacle sh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEsh_o));

        return o;
    }

    public static Obstacle sho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEsho));

        return o;
    }

    //sad
    public static com.nabatfarsi.entity.Player _sad(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad);
        p.setSound(assetManager.get(AssetDescriptors.SAD_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _sad_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad);
        p.setSound(assetManager.get(AssetDescriptors.SAD_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player sad_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad);
        p.setSound(assetManager.get(AssetDescriptors.SAD_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player sad(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERsad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_sad_);
        p.setSound(assetManager.get(AssetDescriptors.SAD_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _sado(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_sado));
        return o;
    }

    public static Obstacle _sad_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_sad_o));
        return o;
    }

    public static Obstacle sad_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEsad_o));
        return o;
    }

    public static Obstacle sado(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEsado));
        return o;
    }

    //zad

    public static com.nabatfarsi.entity.Player _zad(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad);
        p.setSound(assetManager.get(AssetDescriptors.ZAD_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _zad_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad);
        p.setSound(assetManager.get(AssetDescriptors.ZAD_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player zad_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad);
        p.setSound(assetManager.get(AssetDescriptors.ZAD_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player zad(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERzad_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_zad_);
        p.setSound(assetManager.get(AssetDescriptors.ZAD_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _zado(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_zado));
        return o;
    }

    public static Obstacle _zad_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_zad_o));
        return o;
    }

    public static Obstacle zad_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEzad_o));
        return o;
    }

    public static Obstacle zado(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEzado));
        return o;
    }

    //ta
    public static com.nabatfarsi.entity.Player _ta(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta);
        p.setSound(assetManager.get(AssetDescriptors.TA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _ta_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta);

        p.setSound(assetManager.get(AssetDescriptors.TA_MUSIC));

        p.setTextureRegions(playertextures);

        return p;
    }

    public static com.nabatfarsi.entity.Player ta_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta);
        p.setSound(assetManager.get(AssetDescriptors.TA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ta(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERta_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ta_);
        p.setSound(assetManager.get(AssetDescriptors.TA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _tao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_tao));
        return o;
    }

    public static Obstacle _ta_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_ta_o));
        return o;
    }

    public static Obstacle ta_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEta_o));
        return o;
    }

    public static Obstacle tao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEtao));
        return o;
    }

    //za
    public static com.nabatfarsi.entity.Player _za(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza);
        p.setSound(assetManager.get(AssetDescriptors.ZA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _za_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza);
        p.setSound(assetManager.get(AssetDescriptors.ZA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player za_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza);
        p.setSound(assetManager.get(AssetDescriptors.ZA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player za(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERza_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_za_);
        p.setSound(assetManager.get(AssetDescriptors.ZA_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _zao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_zao));
        return o;
    }

    public static Obstacle _za_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_za_o));
        return o;
    }

    public static Obstacle za_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEza_o));
        return o;
    }

    public static Obstacle zao(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEzao));
        return o;
    }

    //ain
    public static com.nabatfarsi.entity.Player _ain(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain);
        p.setSound(assetManager.get(AssetDescriptors.AIN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _ain_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain);

        p.setSound(assetManager.get(AssetDescriptors.AIN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ain_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain);

        p.setSound(assetManager.get(AssetDescriptors.AIN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ain(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERain_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_ain_);

        p.setSound(assetManager.get(AssetDescriptors.AIN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _aino(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_aino));
        return o;
    }

    public static Obstacle _ain_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_ain_o));
        return o;
    }

    public static Obstacle ain_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEain_o));
        return o;
    }

    public static Obstacle aino(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEaino));
        return o;
    }

    //gh
    public static com.nabatfarsi.entity.Player _gh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh);

        p.setSound(assetManager.get(AssetDescriptors.GH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _gh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh);

        p.setSound(assetManager.get(AssetDescriptors.GH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player gh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh);
        p.setSound(assetManager.get(AssetDescriptors.GH_MUSIC));


        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player gh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_gh_);

        p.setSound(assetManager.get(AssetDescriptors.GH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _gho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_gho));
        return o;
    }

    public static Obstacle _gh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_gh_o));
        return o;
    }

    public static Obstacle gh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEgh_o));
        return o;
    }

    public static Obstacle gho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEgho));
        return o;
    }

    //f
    public static com.nabatfarsi.entity.Player _f(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERf_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERff);
        p.setSound(assetManager.get(AssetDescriptors.FF_MUSIC));


        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _f_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERf_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERff);

        p.setSound(assetManager.get(AssetDescriptors.FF_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player f_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERf_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERf_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERf_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERff);

        p.setSound(assetManager.get(AssetDescriptors.FF_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ff(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERff));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERff);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERff);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERf_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_f_);

        p.setSound(assetManager.get(AssetDescriptors.FF_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _fo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_fo));
        return o;
    }

    public static Obstacle _f_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_f_o));
        return o;
    }

    public static Obstacle f_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEf_o));
        return o;
    }

    public static Obstacle ffo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEffo));
        return o;
    }

    //fgh
    public static com.nabatfarsi.entity.Player _fgh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh);

        p.setSound(assetManager.get(AssetDescriptors.FGH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _fgh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh);

        p.setSound(assetManager.get(AssetDescriptors.FGH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player fgh_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh);

        p.setSound(assetManager.get(AssetDescriptors.FGH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player fgh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERfgh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_fgh_);

        p.setSound(assetManager.get(AssetDescriptors.FGH_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _fgho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_fgho));
        return o;
    }

    public static Obstacle _fgh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_fgh_o));
        return o;
    }

    public static Obstacle fgh_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEfgh_o));
        return o;
    }

    public static Obstacle fgho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEfgho));
        return o;
    }

    //k
    public static com.nabatfarsi.entity.Player _k(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERk_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkk);

        p.setSound(assetManager.get(AssetDescriptors.KK_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _k_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERk_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkk);

        p.setSound(assetManager.get(AssetDescriptors.KK_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player k_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERk_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERk_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERk_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkk);

        p.setSound(assetManager.get(AssetDescriptors.KK_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player kk(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkk));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkk);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERkk);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERk_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_k_);

        p.setSound(assetManager.get(AssetDescriptors.KK_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _ko(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_ko));
        return o;
    }

    public static Obstacle _k_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_k_o));
        return o;
    }

    public static Obstacle k_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEk_o));
        return o;
    }

    public static Obstacle kko(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEkko));
        return o;
    }

    //g
    public static com.nabatfarsi.entity.Player _g(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERg_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgg);

        p.setSound(assetManager.get(AssetDescriptors.GG_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _g_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERg_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgg);

        p.setSound(assetManager.get(AssetDescriptors.GG_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player g_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERg_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERg_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERg_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgg);

        p.setSound(assetManager.get(AssetDescriptors.GG_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player gg(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgg));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgg);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERgg);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERg_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_g_);

        p.setSound(assetManager.get(AssetDescriptors.GG_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _go(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_go));
        return o;
    }

    public static Obstacle _g_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_g_o));
        return o;
    }

    public static Obstacle g_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEg_o));
        return o;
    }

    public static Obstacle ggo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEggo));
        return o;
    }

    //L
    public static com.nabatfarsi.entity.Player _l(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERl_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERll);

        p.setSound(assetManager.get(AssetDescriptors.LL_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _l_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERl_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERll);

        p.setSound(assetManager.get(AssetDescriptors.LL_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player l_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERl_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERl_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERl_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERll);

        p.setSound(assetManager.get(AssetDescriptors.LL_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ll(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERll));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERll);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERll);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERl_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_l_);

        p.setSound(assetManager.get(AssetDescriptors.LL_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _lo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_lo));
        return o;
    }

    public static Obstacle _l_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_l_o));
        return o;
    }

    public static Obstacle l_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEl_o));
        return o;
    }

    public static Obstacle llo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEllo));
        return o;
    }

    //m
    public static com.nabatfarsi.entity.Player _m(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERm_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERmm);

        p.setSound(assetManager.get(AssetDescriptors.MM_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _m_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERm_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERmm);

        p.setSound(assetManager.get(AssetDescriptors.MM_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player m_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERm_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERm_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERm_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERmm);

        p.setSound(assetManager.get(AssetDescriptors.MM_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player mm(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERmm));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERmm);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERmm);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERm_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_m_);

        p.setSound(assetManager.get(AssetDescriptors.MM_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _mo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_mo));
        return o;
    }

    public static Obstacle _m_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_m_o));
        return o;
    }

    public static Obstacle m_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEm_o));
        return o;
    }

    public static Obstacle mmo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEmmo));
        return o;
    }


    //n
    public static com.nabatfarsi.entity.Player _n(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERn_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERnn);

        p.setSound(assetManager.get(AssetDescriptors.NN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _n_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERn_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERnn);

        p.setSound(assetManager.get(AssetDescriptors.NN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player n_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERn_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERn_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERn_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERnn);

        p.setSound(assetManager.get(AssetDescriptors.NN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player nn(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERnn));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERnn);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERnn);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERn_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_n_);

        p.setSound(assetManager.get(AssetDescriptors.NN_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _no(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_no));
        return o;
    }

    public static Obstacle _n_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_n_o));
        return o;
    }

    public static Obstacle n_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEn_o));
        return o;
    }

    public static Obstacle nno(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEnno));
        return o;
    }

    //
    public static com.nabatfarsi.entity.Player v_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERv_));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERv_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERv_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERvv);

        p.setSound(assetManager.get(AssetDescriptors.VV_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player vv(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERvv));
        TextureRegion[] playertextures = new TextureRegion[3];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERvv);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERvv);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERv_);


        p.setSound(assetManager.get(AssetDescriptors.VV_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle v_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEv_o));
        return o;
    }

    public static Obstacle vvo(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEvvo));
        return o;
    }

    //h
    public static com.nabatfarsi.entity.Player _h(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERh_);


        p.setSound(assetManager.get(AssetDescriptors.HH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _h_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERhh);

        p.setSound(assetManager.get(AssetDescriptors.HH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player h_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERh_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERh_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERh_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERhh);

        p.setSound(assetManager.get(AssetDescriptors.HH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player hh(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERhh));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERhh);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERhh);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERh_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_h_);

        p.setSound(assetManager.get(AssetDescriptors.HH_MUSIC));

        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _ho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_ho));
        return o;
    }

    public static Obstacle _h_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_h_o));
        return o;
    }

    public static Obstacle h_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEh_o));
        return o;
    }

    public static Obstacle hho(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEhho));
        return o;
    }

    //i
    public static com.nabatfarsi.entity.Player _i(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERi_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERii);

        p.setSound(assetManager.get(AssetDescriptors.II_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player _i_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERi_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERii);

        p.setSound(assetManager.get(AssetDescriptors.II_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player i_(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERi_));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERi_);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERi_);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERii);

        p.setSound(assetManager.get(AssetDescriptors.II_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static com.nabatfarsi.entity.Player ii(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        com.nabatfarsi.entity.Player p = new com.nabatfarsi.entity.Player();
        p.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERii));
        TextureRegion[] playertextures = new TextureRegion[5];
        playertextures[0] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERii);
        playertextures[1] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERii);
        playertextures[2] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i);
        playertextures[3] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYERi_);
        playertextures[4] = gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.PLAYER_i_);

        p.setSound(assetManager.get(AssetDescriptors.II_MUSIC));
        p.setTextureRegions(playertextures);
        return p;
    }

    public static Obstacle _io(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_io));
        return o;
    }

    public static Obstacle _i_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLE_i_o));
        return o;
    }

    public static Obstacle i_o(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEi_o));
        return o;
    }

    public static Obstacle iio(TextureAtlas atlas, AssetManager assetManager) {
        gamePlayAtlas = atlas;
        assetManager = assetManager;
        Obstacle o = new Obstacle();
        o.setTextureRegion(gamePlayAtlas.findRegion(com.nabatfarsi.assets.RegionNames.OBSTACLEiio));
        return o;
    }


}
