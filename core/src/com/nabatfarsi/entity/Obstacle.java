package com.nabatfarsi.entity;

import com.nabatfarsi.config.GameConfig;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.utils.Pool;

public class Obstacle extends GameObjectBase implements Pool.Poolable {


    private boolean hit;

    public Obstacle() {
        super(GameConfig.OBSTACLE_BOUNDS_RADIUS, GameConfig.OBSTACLE_SIZE);
        this.setSettled(false);

    }

    public Obstacle(float radious) {
        super(radious, GameConfig.OBSTACLE_SIZE);

    }


    public boolean isPlayerColliding(Player player) {
        Circle playerBounds = player.getBounds();
        boolean overlaps = Intersector.overlaps(playerBounds, getBounds());
        hit = overlaps;
        return overlaps;
    }

    public boolean isNotHit() {
        return !hit;
    }



    @Override
    public void reset() {
        hit = false;
    }
}
