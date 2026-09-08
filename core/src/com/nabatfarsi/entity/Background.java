package com.nabatfarsi.entity;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by goran on 29/08/2016.
 */
public class Background {

    private float x;
    private float y;
    private float width;
    private float height;
    private TextureRegion textureRegion;

    public TextureRegion[] getTextureRegions() {
        return textureRegions;
    }

    public void setTextureRegions(TextureRegion[] textureRegions) {
        this.textureRegions = textureRegions;
    }

    public TextureRegion getTextureRegions(int i) {
        return textureRegions[i];
    }

    public void setTextureRegions(int i, TextureRegion textureRegion) {
        this.textureRegions[i] = textureRegion;
    }

    private TextureRegion[] textureRegions;






    public Background(TextureRegion textureRegion) {
        this.textureRegion=textureRegion;

    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.textureRegion = textureRegion;
    }
}
