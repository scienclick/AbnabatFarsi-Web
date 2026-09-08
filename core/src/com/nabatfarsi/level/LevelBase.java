package com.nabatfarsi.level;

import com.badlogic.gdx.assets.AssetManager;
import com.nabatfarsi.entity.Obstacle;
import com.nabatfarsi.entity.Player;

/**
 * Created by AShamsa on 12/6/2017.
 */

public abstract class LevelBase {


    protected abstract Player[] GeneratePlayerArray(AssetManager assetManager);

    protected abstract Obstacle[] GenerateObstacleArray(AssetManager assetManager);

    protected abstract com.nabatfarsi.entity.CustomActor GenerateEndScene(String regionName);

    protected abstract com.nabatfarsi.entity.CustomActor GenerateAnimatedActor(AssetManager assetManager);
}
