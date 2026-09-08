package com.nabatfarsi.config;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.MathUtils;



/**
 * Created by AShamsa on 12/1/2017.
 */
//// TODO: 12/23/2017 better color compositions
public class GameColorsConfettis {
    public static final Color PURPLE500 = Color.valueOf("#9C27B0");
    public static final Color PURPLE900 = Color.valueOf("#4A148C");
    public static final Color PINKA400 = Color.valueOf("#F50057");
    public static final Color RED500 = Color.valueOf("#F44336");
    public static final Color REDA700 = Color.valueOf("#D50000");
    public static final Color BLUE500 = Color.valueOf("#2196F3");
    public static final Color BLUE900 = Color.valueOf("#0D47A1");
    public static final Color BLUEA700 = Color.valueOf("#2962FF");
    public static final Color ROCKY = Color.valueOf("#3F51B5");
    public static final Color INDIGO500 = Color.valueOf("#3F51B5");
    public static final Color INDIGOA700 = Color.valueOf("#304FFE");
    public static final Color INDIGO900 = Color.valueOf("#1A237E");
    public static final Color DEEPPURPLE500 = Color.valueOf("#673AB7");
    public static final Color DEEPPURPLE900 = Color.valueOf("#311B92");
    public static final Color DEEPPURPLEA700 = Color.valueOf("#6200EA");
    public static final Color LIGHTBLUEA400 = Color.valueOf("#00B0FF");
    public static final Color LIME400 = Color.valueOf("#C6FF00");
    public static final Color LIGHTGREENA400 = Color.valueOf("#76FF03");
    public static final Color DARKGREEN900 = Color.valueOf("#1B5E20");
    public static final Color ORANGE500 = Color.valueOf("#FF9800");
    public static final Color ORANGE600 = Color.valueOf("#FB8C00");
    public static final Color ORANGEA700 = Color.valueOf("#FF6D00");
    public static final Color AMBER500 = Color.valueOf("#FFC107");
    public static final Color AMBER900 = Color.valueOf("#FF6F00");
    public static final Color DEEPORANGE500 = Color.valueOf("#FF5722");
    public static final Color BLACK = Color.valueOf("#000000");
    public static final Color[] ORANGE = {ORANGE500,ORANGE600,ORANGEA700,DEEPORANGE500};
    public static final Color[] AMBER = {AMBER900,AMBER900,AMBER500};
    public static final Color[] RED = {PINKA400,RED500,REDA700};
    public static final Color[] BLUE = {BLUE500,BLUE900,BLUEA700,ROCKY,LIGHTBLUEA400};
    public static final Color[] GREEN = {LIGHTGREENA400,LIGHTGREENA400,Color.FOREST,DARKGREEN900};
    public static final Color[] PURPLE = {PURPLE900,PURPLE500,DEEPPURPLE900,DEEPPURPLE900,DEEPPURPLE500,DEEPPURPLEA700};
    public static final Color[] INDIGO = {INDIGO500,INDIGOA700,INDIGO900};
    public static final Color[] YELLOW = {LIME400,Color.YELLOW};
/*    public static final Color[] ORANGE = {Color.valueOf("#f06d1d")};
    public static final Color[] AMBER = {Color.valueOf("#a06734")};
    public static final Color[] RED = {Color.valueOf("#832525")};
    public static final Color[] BLUE = {Color.valueOf("#0781f3")};
    public static final Color[] GREEN = {Color.valueOf("#69af50")};
    public static final Color[] PURPLE = {Color.valueOf("#8977cf")};
    public static final Color[] INDIGO = {Color.valueOf("#316cc4")};
    public static final Color[] YELLOW = {Color.valueOf("#b2b727")};*/
/*    public static final Color[] COLORS = new Color[]{PURPLE500, PURPLE900, PINKA400, RED500, REDA700, PINKA400, RED500, REDA700,
            BLUE500, BLUE900, BLUEA700, INDIGO500, INDIGO900, INDIGOA700, DEEPORANGE500, DEEPPURPLE500, DEEPPURPLE900, DEEPPURPLEA700,
            LIGHTBLUEA400, LIGHTGREENA400, LIGHTGREENA400, LIME400, LIME400, DARKGREEN900, ORANGE500, ORANGE600, ORANGEA700,
            AMBER500, AMBER900, BLACK,AMBER500, AMBER900, BLACK,BLACK,SCAMPI,ROCKY};*/
public static final Color[] COLORS = new Color[]{BLUE900,REDA700,Color.FOREST,Color.GOLD,Color.ORANGE,Color.NAVY};
    //public static final Color[] COLORS = new Color[]{ROCKY};

    public static Color GetRandomColor() {
        int random = MathUtils.random(1, 8);
        switch (random) {
            case 1:
               return GREEN[MathUtils.random(0, ORANGE.length - 1)];
            case 2:
                return AMBER[MathUtils.random(0, AMBER.length - 1)];
            case 3:
                return RED[MathUtils.random(0, RED.length - 1)];
            case 4:
                return BLUE[MathUtils.random(0, BLUE.length - 1)];
            case 5:
                return GREEN[MathUtils.random(0, GREEN.length - 1)];
            case 6:
                return PURPLE[MathUtils.random(0, PURPLE.length - 1)];
            case 7:
                return INDIGO[MathUtils.random(0, INDIGO.length - 1)];
            case 8:
                return YELLOW[MathUtils.random(0, YELLOW.length - 1)];

        }
        return BLACK;
    }


    public static final String[] Confettyregions = {  com.nabatfarsi.assets.RegionNames.CONFETTI0,
            com.nabatfarsi.assets.RegionNames.CONFETTI1,
            com.nabatfarsi.assets.RegionNames.CONFETTI2,
            com.nabatfarsi.assets.RegionNames.CONFETTI3,
            com.nabatfarsi.assets.RegionNames.CONFETTI4};

    public static String GetRandomConfettiRegion() {
        int random = MathUtils.random(0, Confettyregions.length-1);
        return Confettyregions[random];

     }



}
