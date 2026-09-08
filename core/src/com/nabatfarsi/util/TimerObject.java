package com.nabatfarsi.util;

/**
 * Created by AShamsa on 12/10/2017.
 */

public class TimerObject {
    private int indexer =-999;

    public int getIndexer() {
        return indexer;
    }

    public void setIndexer(int indexer) {
        this.indexer = indexer;
    }

    public float getTimer() {
        return timer;
    }

    public void setTimer(float timer) {
        this.timer = timer;
    }

    private float timer =0;

    public boolean isTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(boolean timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    private boolean timeElapsed =false;


}
