package com.example.bridge;

/**
 * @author jackwu
 */
public abstract class Shape {

    protected DrawAPI drawApi;

    public Shape(DrawAPI drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
