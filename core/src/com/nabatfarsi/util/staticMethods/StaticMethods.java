package com.nabatfarsi.util.staticMethods;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.Logger;
import com.nabatfarsi.assets.AssetDescriptors;
import com.nabatfarsi.util.TimerObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AShamsa on 12/11/2017.
 */

public class StaticMethods {
    private static final Logger log=new Logger(StaticMethods.class.getCanonicalName(), Logger.DEBUG);
    public static boolean lagtimeElapsed(float delta, float lagTime, TimerObject timerobject) {
        boolean isFree = false;

        if (timerobject.getTimer() >= lagTime) {
            isFree = true;
            timerobject.setTimer(0);
        }
        //log.debug("RequestedlagTime="+lagTime+"achievedSoFar"+timerobject.getTimer());
        //log.debug("deltaElapsed"+delta);
        timerobject.setTimer(timerobject.getTimer() + delta);

        return isFree;

    }

    public static int GiveRandomNumberafterDelay(float delta, float lagTime, TimerObject timerobject, int min, int max){


        if (lagtimeElapsed(delta, lagTime, timerobject)) {
            timerobject.setIndexer( MathUtils.random(min, max));

        }
        //log.debug("RequestedlagTime="+lagTime+"achievedSoFar= "+timerobject.getTimer()+"integer value="+timerobject.getIndexer());
        return timerobject.getIndexer();


    }

    public static Map<Integer, AssetDescriptor<TextureAtlas>> fillAssetMap() {

        Map<Integer, AssetDescriptor<TextureAtlas>> assetDescriptorMap = new HashMap<Integer, AssetDescriptor<TextureAtlas>>();
        assetDescriptorMap.put(0, AssetDescriptors.GAME_PLAY_L1_AB);
        assetDescriptorMap.put(1, AssetDescriptors.GAME_PLAY_L1_AB);
        assetDescriptorMap.put(2, AssetDescriptors.GAME_PLAY_L2_BARAN);
        assetDescriptorMap.put(3, AssetDescriptors.GAME_PLAY_L2_BARAN);
        assetDescriptorMap.put(4, AssetDescriptors.GAME_PLAY_L3_PRVANH);
        assetDescriptorMap.put(5, AssetDescriptors.GAME_PLAY_L3_PRVANH);
        assetDescriptorMap.put(6, AssetDescriptors.GAME_PLAY_L4_TOOP);
        assetDescriptorMap.put(7, AssetDescriptors.GAME_PLAY_L4_TOOP);
        assetDescriptorMap.put(8, AssetDescriptors.GAME_PLAY_L5_SANIEH);
        assetDescriptorMap.put(9, AssetDescriptors.GAME_PLAY_L5_SANIEH);
        assetDescriptorMap.put(10, AssetDescriptors.GAME_PLAY_L6_JAROO);
        assetDescriptorMap.put(11, AssetDescriptors.GAME_PLAY_L6_JAROO);
        assetDescriptorMap.put(12, AssetDescriptors.GAME_PLAY_L7_CHTR);
        assetDescriptorMap.put(13, AssetDescriptors.GAME_PLAY_L7_CHTR);
        assetDescriptorMap.put(14, AssetDescriptors.GAME_PLAY_L8_HOBAB);
        assetDescriptorMap.put(15, AssetDescriptors.GAME_PLAY_L8_HOBAB);
        assetDescriptorMap.put(16, AssetDescriptors.GAME_PLAY_L9_KHORSHID);
        assetDescriptorMap.put(17, AssetDescriptors.GAME_PLAY_L9_KHORSHID);
        assetDescriptorMap.put(18, AssetDescriptors.GAME_PLAY_L10_DRAKHT);
        assetDescriptorMap.put(19, AssetDescriptors.GAME_PLAY_L10_DRAKHT);
        assetDescriptorMap.put(20, AssetDescriptors.GAME_PLAY_L11_ZRT);
        assetDescriptorMap.put(21, AssetDescriptors.GAME_PLAY_L11_ZRT);
        assetDescriptorMap.put(22, AssetDescriptors.GAME_PLAY_L12_ROOZNAMEH);
        assetDescriptorMap.put(23, AssetDescriptors.GAME_PLAY_L12_ROOZNAMEH);
        assetDescriptorMap.put(24, AssetDescriptors.GAME_PLAY_L13_ZANBOOR);
        assetDescriptorMap.put(25, AssetDescriptors.GAME_PLAY_L13_ZANBOOR);
        assetDescriptorMap.put(26, AssetDescriptors.GAME_PLAY_L14_JELE);
        assetDescriptorMap.put(27, AssetDescriptors.GAME_PLAY_L14_JELE);
        assetDescriptorMap.put(28, AssetDescriptors.GAME_PLAY_L15_SNG);
        assetDescriptorMap.put(29, AssetDescriptors.GAME_PLAY_L15_SNG);
        assetDescriptorMap.put(30, AssetDescriptors.GAME_PLAY_L16_SHALGARDN);
        assetDescriptorMap.put(31, AssetDescriptors.GAME_PLAY_L16_SHALGARDN);
        assetDescriptorMap.put(32, AssetDescriptors.GAME_PLAY_L17_SABOON);
        assetDescriptorMap.put(33, AssetDescriptors.GAME_PLAY_L17_SABOON);
        assetDescriptorMap.put(34, AssetDescriptors.GAME_PLAY_L18_ZABT);
        assetDescriptorMap.put(35, AssetDescriptors.GAME_PLAY_L18_ZABT);
        assetDescriptorMap.put(36, AssetDescriptors.GAME_PLAY_L19_TABL);
        assetDescriptorMap.put(37, AssetDescriptors.GAME_PLAY_L19_TABL);
        assetDescriptorMap.put(38, AssetDescriptors.GAME_PLAY_L20_ZARF);
        assetDescriptorMap.put(39, AssetDescriptors.GAME_PLAY_L20_ZARF);
        assetDescriptorMap.put(40, AssetDescriptors.GAME_PLAY_L21_EINAK);
        assetDescriptorMap.put(41, AssetDescriptors.GAME_PLAY_L21_EINAK);
        assetDescriptorMap.put(42, AssetDescriptors.GAME_PLAY_L22_GHAVAS);
        assetDescriptorMap.put(43, AssetDescriptors.GAME_PLAY_L22_GHAVAS);
        assetDescriptorMap.put(44, AssetDescriptors.GAME_PLAY_L23_FANOOS);
        assetDescriptorMap.put(45, AssetDescriptors.GAME_PLAY_L23_FANOOS);
        assetDescriptorMap.put(46, AssetDescriptors.GAME_PLAY_L24_GHLM);
        assetDescriptorMap.put(47, AssetDescriptors.GAME_PLAY_L24_GHLM);
        assetDescriptorMap.put(48, AssetDescriptors.GAME_PLAY_L25_KIF);
        assetDescriptorMap.put(49, AssetDescriptors.GAME_PLAY_L25_KIF);
        assetDescriptorMap.put(50, AssetDescriptors.GAME_PLAY_L26_GOLOLDAN);
        assetDescriptorMap.put(51, AssetDescriptors.GAME_PLAY_L26_GOLOLDAN);
        assetDescriptorMap.put(52, AssetDescriptors.GAME_PLAY_L27_LENJ);
        assetDescriptorMap.put(53, AssetDescriptors.GAME_PLAY_L27_LENJ);
        assetDescriptorMap.put(54, AssetDescriptors.GAME_PLAY_L28_MOOSHAK);
        assetDescriptorMap.put(55, AssetDescriptors.GAME_PLAY_L28_MOOSHAK);
        assetDescriptorMap.put(56, AssetDescriptors.GAME_PLAY_L29_NAGHASHI);
        assetDescriptorMap.put(57, AssetDescriptors.GAME_PLAY_L29_NAGHASHI);
        assetDescriptorMap.put(58, AssetDescriptors.GAME_PLAY_L30_VAZNEH);
        assetDescriptorMap.put(59, AssetDescriptors.GAME_PLAY_L30_VAZNEH);
        assetDescriptorMap.put(60, AssetDescriptors.GAME_PLAY_L31_HAVAPEIMA);
        assetDescriptorMap.put(61, AssetDescriptors.GAME_PLAY_L31_HAVAPEIMA);
        assetDescriptorMap.put(62, AssetDescriptors.GAME_PLAY_L32_IKHMAK);
        assetDescriptorMap.put(63, AssetDescriptors.GAME_PLAY_L32_IKHMAK);


        return assetDescriptorMap;
    }

    public static Map<Integer, AssetDescriptor<Music>[]> fillMUSICAssetMap() {

        Map<Integer, AssetDescriptor<Music>[]> assetDescriptorMap = new HashMap<Integer, AssetDescriptor<Music>[]>();
        assetDescriptorMap.put(0, AssetDescriptors.L1_MUSICS);
        assetDescriptorMap.put(1, AssetDescriptors.D1_MUSICS);
        assetDescriptorMap.put(2, AssetDescriptors.L2_MUSICS);
        assetDescriptorMap.put(3, AssetDescriptors.D2_MUSICS);
        assetDescriptorMap.put(4, AssetDescriptors.L3_MUSICS);
        assetDescriptorMap.put(5, AssetDescriptors.D3_MUSICS);
        assetDescriptorMap.put(6, AssetDescriptors.L4_MUSICS);
        assetDescriptorMap.put(7, AssetDescriptors.D4_MUSICS);
        assetDescriptorMap.put(8, AssetDescriptors.L5_MUSICS);
        assetDescriptorMap.put(9, AssetDescriptors.D5_MUSICS);
        assetDescriptorMap.put(10, AssetDescriptors.L6_MUSICS);
        assetDescriptorMap.put(11, AssetDescriptors.D6_MUSICS);
        assetDescriptorMap.put(12, AssetDescriptors.L7_MUSICS);
        assetDescriptorMap.put(13, AssetDescriptors.D7_MUSICS);
        assetDescriptorMap.put(14, AssetDescriptors.L8_MUSICS);
        assetDescriptorMap.put(15, AssetDescriptors.D8_MUSICS);
        assetDescriptorMap.put(16, AssetDescriptors.L9_MUSICS);
        assetDescriptorMap.put(17, AssetDescriptors.D9_MUSICS);
        assetDescriptorMap.put(18, AssetDescriptors.L10_MUSICS);
        assetDescriptorMap.put(19, AssetDescriptors.D10_MUSICS);
        assetDescriptorMap.put(20, AssetDescriptors.L11_MUSICS);
        assetDescriptorMap.put(21, AssetDescriptors.D11_MUSICS);
        assetDescriptorMap.put(22, AssetDescriptors.L12_MUSICS);
        assetDescriptorMap.put(23, AssetDescriptors.D12_MUSICS);
        assetDescriptorMap.put(24, AssetDescriptors.L13_MUSICS);
        assetDescriptorMap.put(25, AssetDescriptors.D13_MUSICS);
        assetDescriptorMap.put(26, AssetDescriptors.L14_MUSICS);
        assetDescriptorMap.put(27, AssetDescriptors.D14_MUSICS);
        assetDescriptorMap.put(28, AssetDescriptors.L15_MUSICS);
        assetDescriptorMap.put(29, AssetDescriptors.D15_MUSICS);
        assetDescriptorMap.put(30, AssetDescriptors.L16_MUSICS);
        assetDescriptorMap.put(31, AssetDescriptors.D16_MUSICS);
        assetDescriptorMap.put(32, AssetDescriptors.L17_MUSICS);
        assetDescriptorMap.put(33, AssetDescriptors.D17_MUSICS);
        assetDescriptorMap.put(34, AssetDescriptors.L18_MUSICS);
        assetDescriptorMap.put(35, AssetDescriptors.D18_MUSICS);
        assetDescriptorMap.put(36, AssetDescriptors.L19_MUSICS);
        assetDescriptorMap.put(37, AssetDescriptors.D19_MUSICS);
        assetDescriptorMap.put(38, AssetDescriptors.L20_MUSICS);
        assetDescriptorMap.put(39, AssetDescriptors.D20_MUSICS);
        assetDescriptorMap.put(40, AssetDescriptors.L21_MUSICS);
        assetDescriptorMap.put(41, AssetDescriptors.D21_MUSICS);
        assetDescriptorMap.put(42, AssetDescriptors.L22_MUSICS);
        assetDescriptorMap.put(43, AssetDescriptors.D22_MUSICS);
        assetDescriptorMap.put(44, AssetDescriptors.L23_MUSICS);
        assetDescriptorMap.put(45, AssetDescriptors.D23_MUSICS);
        assetDescriptorMap.put(46, AssetDescriptors.L24_MUSICS);
        assetDescriptorMap.put(47, AssetDescriptors.D24_MUSICS);
        assetDescriptorMap.put(48, AssetDescriptors.L25_MUSICS);
        assetDescriptorMap.put(49, AssetDescriptors.D25_MUSICS);
        assetDescriptorMap.put(50, AssetDescriptors.L26_MUSICS);
        assetDescriptorMap.put(51, AssetDescriptors.D26_MUSICS);
        assetDescriptorMap.put(52, AssetDescriptors.L27_MUSICS);
        assetDescriptorMap.put(53, AssetDescriptors.D27_MUSICS);
        assetDescriptorMap.put(54, AssetDescriptors.L28_MUSICS);
        assetDescriptorMap.put(55, AssetDescriptors.D28_MUSICS);
        assetDescriptorMap.put(56, AssetDescriptors.L29_MUSICS);
        assetDescriptorMap.put(57, AssetDescriptors.D29_MUSICS);
        assetDescriptorMap.put(58, AssetDescriptors.L30_MUSICS);
        assetDescriptorMap.put(59, AssetDescriptors.D30_MUSICS);
        assetDescriptorMap.put(60, AssetDescriptors.L31_MUSICS);
        assetDescriptorMap.put(61, AssetDescriptors.D31_MUSICS);
        assetDescriptorMap.put(62, AssetDescriptors.L32_MUSICS);
        assetDescriptorMap.put(63, AssetDescriptors.D32_MUSICS);


        return assetDescriptorMap;
    }
}
