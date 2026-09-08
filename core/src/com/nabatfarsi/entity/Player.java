package com.nabatfarsi.entity;

import com.nabatfarsi.config.GameConfig;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by goran on 23/08/2016.
 */
public class Player extends GameObjectBase {





    public Player() {

        super(GameConfig.PLAYER_BOUNDS_RADIUS, GameConfig.PLAYER_SIZE);
        this.setSettled(false);
        //setSize(GameConfig.PLAYER_SIZE,  GameConfig.PLAYER_SIZE);
    }
    public Player(float boundsRadius, float yspan) {

        super(boundsRadius, yspan);
        this.setSettled(false);
        //setSize(GameConfig.PLAYER_SIZE,  GameConfig.PLAYER_SIZE);
    }
    public Player(float boundsRadius, float yspan,float x, float y) {

        super(boundsRadius, yspan,x, y);
        this.setSettled(false);
        //setSize(GameConfig.PLAYER_SIZE,  GameConfig.PLAYER_SIZE);
    }


    public boolean isPlayerTouched(Vector2 vector2) {
        Circle TouchBounds = new Circle(vector2.x, vector2.y, GameConfig.TOUCH_BOUNDS_RADIUS );

        // check if playerBounds overlap obstacle bounds
        boolean overlaps = Intersector.overlaps(TouchBounds, getBounds());


        return overlaps;
    }





}
