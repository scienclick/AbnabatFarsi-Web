package com.nabatfarsi.config;

/**
 * Created by goran on 22/08/2016.
 */
public class GameAnimationConfig {


    public static final float PLAYER_FRAME_LAG_TIME = .35f; // time between frames
    public static final float ACTIVE_PLAYER_SCALER_LAG_TIME = .15f;



    public static final float BIRD_FLAP_FRAME_LAG_TIME = .15f; // time between frames
    public static final float BIRD_FLAP_ONCALL_FRAME_LAG_TIME = BIRD_FLAP_FRAME_LAG_TIME / 8;
    public static final float BIRD_MOVEMENT_RANDOM_FRAME_LAG_TIME = 5f; // time between frames
    public static final float BIRD_MOVEMENT_RANDOM_PER_DELTA = .01f; // world units


    public static final float LETTER_MOVEMENT_RANDOM_FRAME_LAG_TIME = 12f; // things will move every 10 second
    public static final float LETTER_MOVEMENT_RANDOM_PER_DELTA = .008f; // world units
    public static final float LETTER_SELECTION_PERIOD_FOR_MOVEMENT = 7f; // world units

    public static final float VELOCITY1 = .1f; // Jump Height
    public static final float VELOCITY_STEPS = .01f; // world units
    public static final float JUMPING_PERIOD_LAG_TIME = 2f; // things will move every 10 second
    public static final float SPIN_PERIOD_LAG_TIME = 5f; // things will move every 10 second
    public static final float SPIN_STEPS = 0.1f; // things will move every 10 second
    public static final float LINEARITY_MOVEMENT = 5f; //travel path would be a linear line if 1

    public static final boolean DYNAMIC = false;

    //D1 ab
    public static final float DEMO_LAG_TIME6 = 1f/6f; // things will move every 10 second
    public static final float DEMO_LAG_TIME12 = 1f/12f; // things will move every 10 second


    public static final float CONFETTY_VELOCITY_STEP = .0009f;
    public static final float INITIALVELOCITY_Y = .1f;
    public static final float INITIALVELOCITY_X = .02f;

    private GameAnimationConfig() {
    }
}
