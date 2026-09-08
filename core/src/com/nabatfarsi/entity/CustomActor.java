package com.nabatfarsi.entity;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by AShamsa on 12/4/2017.
 */

public class CustomActor extends Actor{



    private TextureRegion region;

    private TextureRegion[] textureRegions;
    private Animation s_animation;
    private float age=0;



    private float velocitY;
    private float velocityX;



    public CustomActor(TextureRegion region) {
        this.region = region;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        Color color = getColor();
        batch.setColor(color);

        batch.draw(region,
                getX(), getY(),
                getOriginX(), getOriginY(),
                getWidth(), getHeight(),
                getScaleX(), getScaleY(),
                getRotation()
        );

    }

    public TextureRegion[] getTextureRegions() {
        return textureRegions;
    }

    public void setTextureRegions(TextureRegion[] textureRegions) {
        this.textureRegions = textureRegions;
    }

    public Animation getAnimation() {
        return s_animation;
    }

    public void setAnimation(Animation s_animation) {
        this.s_animation = s_animation;
    }


    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
    public void setRegion(TextureRegion region) {
        this.region = region;
    }

    public float getVelocitY() {
        return velocitY;
    }

    public void setVelocityY(float velocitY) {
        this.velocitY = velocitY;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }
}
