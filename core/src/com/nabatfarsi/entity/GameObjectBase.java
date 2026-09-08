package com.nabatfarsi.entity;

import com.nabatfarsi.config.GameColorsConfettis;
import com.nabatfarsi.config.GameConfig;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Logger;

import java.util.UUID;

import static com.nabatfarsi.util.staticMethods.StaticMethods.lagtimeElapsed;

/**
 * Created by goran on 25/08/2016.
 */
public  class GameObjectBase {
    private static final Logger log = new Logger(GameObjectBase.class.getCanonicalName(), Logger.DEBUG);

    private UUID id;
    private float x;
    private float y;
    private float width;
    private float height;
    private Circle bounds;
    private TextureRegion textureRegion;
    private TextureRegion[] textureRegions;
    private float yspan;//worldunit

    private Color color;//worldunit
    private float Initialrandomrotation=0;//worldunit

    private float Newrandomrotation=0;//worldunit

    private float timer = 0;//worldunit
    private int indexCounter = 0;//worldunit

    private boolean reachedDestination = true;
    private boolean IsSettled;
    private boolean IsJumped=false;
    private boolean IsSpined=false;

    private boolean moveRight = true;


    private Vector2 destination = new Vector2();
    private Vector2 origin = new Vector2();

    public Vector2 getFinaldestination() {
        return finaldestination;
    }

    public void setFinaldestination(Vector2 finaldestination) {
        this.finaldestination = finaldestination;
    }

    private Vector2 finaldestination = new Vector2();



    private float velocity = com.nabatfarsi.config.GameAnimationConfig.VELOCITY1- com.nabatfarsi.config.GameAnimationConfig.VELOCITY_STEPS;


    private boolean ballonPopped = false;
    private TextureRegion tempTextureRegion;


    private TextureRegion textureRegion4Dragging;





    private Music sound;





    public GameObjectBase(float boundsRadius, float yspan) {
/*        id = UUID.randomUUID();
        bounds = new Circle(x, y, boundsRadius);
        this.yspan = yspan;
        this.color = GameColorsConfettis.GetRandomColor();
        this.Initialrandomrotation = MathUtils.random(0, 15) * MathUtils.randomSign();
        this.Newrandomrotation =Initialrandomrotation==0?0: -Initialrandomrotation+GameAnimationConfig.SPIN_STEPS*Initialrandomrotation/ Math.abs(Initialrandomrotation);
        this.setSettled(true);
        this.setPosition(x, y);
        this.setDestination(new Vector2(x, y));
        this.setOrigin(new Vector2(x, y));*/
        InitializeGameObjectBase(boundsRadius, yspan, x, y);

    }

    public GameObjectBase(float boundsRadius, float yspan, float x, float y) {

   /*     id = UUID.randomUUID();
        bounds = new Circle(x, y, boundsRadius);
        this.yspan = yspan;
        this.color = GameColorsConfettis.GetRandomColor();
        this.Initialrandomrotation = MathUtils.random(0, 15) * MathUtils.randomSign();
        this.Newrandomrotation =Initialrandomrotation==0?0: -Initialrandomrotation+GameAnimationConfig.SPIN_STEPS*Initialrandomrotation/ Math.abs(Initialrandomrotation);
        this.setSettled(true);
        this.setPosition(x, y);
        this.setDestination(new Vector2(x, y));
        this.setOrigin(new Vector2(x, y));*/
        InitializeGameObjectBase(boundsRadius, yspan, x, y);

    }
    private void InitializeGameObjectBase(float boundsRadius, float yspan, float x, float y) {

        id = UUID.randomUUID();
        bounds = new Circle(x, y, boundsRadius);
        this.yspan = yspan;
        this.color = GameColorsConfettis.GetRandomColor();
        this.Initialrandomrotation = MathUtils.random(0, 15) * MathUtils.randomSign();
        this.Newrandomrotation =Initialrandomrotation==0?0: -Initialrandomrotation+ com.nabatfarsi.config.GameAnimationConfig.SPIN_STEPS*Initialrandomrotation/ Math.abs(Initialrandomrotation);
        this.setSettled(true);
        this.setPosition(x, y);
        this.setDestination(new Vector2(x, y));
        this.setOrigin(new Vector2(x, y));


    }

    public UUID getId() {
        return id;
    }



    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;

            updateBounds();

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
        updateBounds();
    }

    public void setY(float y) {
        this.y = y;
        updateBounds();
    }

    public void setSize(float width, float height) {
        this.width = width;
        this.height = height;
        updateBounds();
    }
    public void setSize(float width, float height,boolean updatebounds) {
        this.width = width;
        this.height = height;

        if (updatebounds) {
            updateBounds();
        }
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }


    public Circle getBounds() {
        return bounds;
    }

    public Color getColor() {
        return color;
    }

    public float getInitialrandomrotation() {
        return Initialrandomrotation;
    }

    public void setInitialrandomrotation(float initialrandomrotation) {
        this.Initialrandomrotation = initialrandomrotation;
    }

    public float getTimer() {
        return timer;
    }

    public void setTimer(float timer) {
        this.timer = timer;
    }

    public int getIndexCounter() {
        return indexCounter;
    }

    public void setIndexCounter(int indexCounter) {
        this.indexCounter = indexCounter;
    }

    public boolean isMoveRight() {
        return moveRight;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public Vector2 getDestination() {
        return destination;
    }

    public void setDestination(Vector2 destination) {

        this.destination = destination;
    }



    public boolean isReachedDestination() {
        return reachedDestination;
    }


    public boolean isJumped() {
        return IsJumped;
    }

    public void setJumped(boolean jumped) {
        IsJumped = jumped;
    }

    public boolean isSpined() {
        return IsSpined;
    }

    public void setSpined(boolean spined) {
        IsSpined = spined;
    }
    public float getNewrandomrotation() {
        return Newrandomrotation;
    }

    public void setNewrandomrotation(float newrandomrotation) {
        Newrandomrotation = newrandomrotation;
    }


    public boolean isBallonPopped() {
        return ballonPopped;
    }

    public void setBallonPopped(boolean ballonPopped) {
        this.ballonPopped = ballonPopped;
    }

    public TextureRegion getTempTextureRegion() {
        return tempTextureRegion;
    }

    public void setTempTextureRegion(TextureRegion tempTextureRegion) {
        this.tempTextureRegion = tempTextureRegion;

    }
    public Vector2 getOrigin() {
        return origin;
    }

    public void setOrigin(Vector2 origin) {
        this.origin = origin;
    }

    public TextureRegion[] getTextureRegions() {
        return textureRegions;
    }

    public void setTextureRegions(TextureRegion[] textureRegions) {
        this.textureRegions = textureRegions;
    }

    public TextureRegion getTextureRegion(int i) {
        return textureRegions[i];
    }

    public TextureRegion getTextureRegion() {
        return textureRegion;
    }

    public void setTextureRegion(TextureRegion textureRegion) {
        this.textureRegion = textureRegion;
        this.setSize(yspan * textureRegion.getRegionWidth() / textureRegion.getRegionHeight(), yspan);
    }

    public boolean isSettled() {
        return IsSettled;
    }

    public void setSettled(boolean settled) {
        IsSettled = settled;
    }

    public void setSound(Music music) {
        this.sound = music;

    }
    public Music getSound() {
        return sound;
    }


    public TextureRegion getTextureRegion4Dragging() {
        return textureRegion4Dragging;
    }

    public void setTextureRegion4Dragging(TextureRegion textureRegion4Dragging) {
        this.textureRegion4Dragging = textureRegion4Dragging;
    }
    public void drawDebug(ShapeRenderer renderer) {
        renderer.x(bounds.x, bounds.y, 0.1f);
        renderer.circle(bounds.x, bounds.y, bounds.radius, 30);
        //renderer.rect(bounds.x-getWidth()/2,bounds.y-getHeight()/2,getWidth(),getHeight());
    }

    public void updateBounds() {
        float halfWidth = width / 2f;
        float halfHeight = height / 2f;
        bounds.setPosition(x + halfWidth, y + halfHeight);
    }

    @Override
    public boolean equals(Object o) {
        GameObjectBase Go = (GameObjectBase) o;
        return this.id == Go.id;
    }


    private void ShuBirdie(float movePerDelta) {
        //speedfactor:1 is the original BIRD_MOVEMENT_RANDOM_PER_DELTA
        this.reachedDestination = false;
        float Xmovement;
        float Ymovement;
        try {
            float Dx = this.x - this.destination.x;
            float Dy = this.y - this.destination.y;
            if (Math.abs(Dx) > Math.abs(Dy)) {
                Xmovement = movePerDelta;

                Ymovement = Math.abs(Dy / Dx * Xmovement) * com.nabatfarsi.config.GameAnimationConfig.LINEARITY_MOVEMENT;
            } else {
                Ymovement = movePerDelta;
                Xmovement = Math.abs(Dx / Dy * Ymovement) * com.nabatfarsi.config.GameAnimationConfig.LINEARITY_MOVEMENT;

            }
            if (Math.abs(this.x - destination.x) > 0.1 | Math.abs(this.y - this.destination.y) > 0.1) {

                if (this.x > this.destination.x & this.y > this.destination.y) {
                    this.setPosition(this.x - Xmovement, this.y - Ymovement);
                    this.setMoveRight(true);
                } else if (this.x > this.destination.x & this.y < this.destination.y) {
                    this.setPosition(this.x - Xmovement, this.y + Ymovement);
                    this.setMoveRight(true);
                } else if (this.x < this.destination.x & this.y > this.destination.y) {
                    this.setPosition(this.x + Xmovement, this.y - Ymovement);
                    this.setMoveRight(false);
                } else if (this.x < this.destination.x & this.y < this.destination.y) {
                    this.setPosition(this.x + Xmovement, this.y + Ymovement);
                    this.setMoveRight(false);
                }

            } else {
                this.reachedDestination = true;
                this.setOrigin(new Vector2(this.getDestination().x, getDestination().y));
                 }
            this.setSettled(false);
        } catch (Exception e) {
            // e.printStackTrace();
        }


        //log.debug(this.getId()+"originX=" + this.origin.x + "OriginY=" +origin.y+ "   Destx=" + destination.x + "  DestY=" + destination.y);

    }
    public void ShuBirdieWithDelay(float movePerDelta, float delta, float lagTime, com.nabatfarsi.util.TimerObject timer) {
        //log.debug("shuBirdtoTimer==="+timer.getTimer()+"delta");
        //to create a random destination
        if (lagtimeElapsed(delta, lagTime, timer)) {

            if (this.isReachedDestination()) {
                this.setDestination(new Vector2(MathUtils.random(0, GameConfig.WORLD_WIDTH - GameConfig.BIRD_SIZE),
                        MathUtils.random(GameConfig.WORLD_HEIGHT - 1, GameConfig.WORLD_HEIGHT - GameConfig.BIRD_SIZE)));
            }
        }

        if (this != null) {
            this.ShuBirdie(movePerDelta);
        }
    }
    public void ShuBirdieWithDelay(float movePerDelta, float delta, float lagTime, com.nabatfarsi.util.TimerObject timer, float min, float max) {
//        log.debug("shuBirdtoTimer==="+timer.getTimer()+"delta");
        //to just move a little by adding a random value to original
        if (lagtimeElapsed(delta, lagTime, timer)) {

            if (this.isReachedDestination()) {
                float xx = MathUtils.clamp(this.getOrigin().x+MathUtils.random(min,max), 1, GameConfig.WORLD_WIDTH - width);
                float yy = MathUtils.clamp(getOrigin().y+MathUtils.random(min/5,max/5), 0, GameConfig.WORLD_HEIGHT - height);
                this.setDestination(new Vector2(xx,yy));
            }
        }

        if (this != null) {
            this.ShuBirdie(movePerDelta);
        }
    }

    public void Jump(float delta, float lagTime, com.nabatfarsi.util.TimerObject timer) {
//        log.debug("shuBirdtoTimer==="+timer.getTimer()+"delta");
        //to just move a little by adding a random value to original

        if (lagtimeElapsed(delta, lagTime, timer)) {
            this.setJumped(false);;
        }
            if (!this.isJumped()) {


                if (Math.abs(Math.abs(velocity) - Math.abs(com.nabatfarsi.config.GameAnimationConfig.VELOCITY1))>.0001) {
                    this.setPosition(x,y+=velocity);
                    velocity-= com.nabatfarsi.config.GameAnimationConfig.VELOCITY_STEPS;
                }else {
                    this.velocity = com.nabatfarsi.config.GameAnimationConfig.VELOCITY1- com.nabatfarsi.config.GameAnimationConfig.VELOCITY_STEPS;
                    this.setJumped(true);
                }

            }
    }

    public void Spin(float delta, float lagTime, com.nabatfarsi.util.TimerObject timer) {
        if (lagtimeElapsed(delta, lagTime, timer)) {
            this.setSpined(false);;
        }
        if (!this.isSpined()) {
            if (Math.abs(Math.abs(this.Newrandomrotation) - Math.abs(this.getInitialrandomrotation()))>.0001) {
                if (this.Initialrandomrotation>0) {
                    Newrandomrotation += com.nabatfarsi.config.GameAnimationConfig.SPIN_STEPS;
                }else {
                    Newrandomrotation -= com.nabatfarsi.config.GameAnimationConfig.SPIN_STEPS;
                }
            }else {
                this.setInitialrandomrotation(-Newrandomrotation);
                this.setNewrandomrotation(Newrandomrotation==0?0:Newrandomrotation- com.nabatfarsi.config.GameAnimationConfig.SPIN_STEPS*Newrandomrotation/Math.abs(Newrandomrotation));
                this.setSpined(true);
            }

        }
    }
}
