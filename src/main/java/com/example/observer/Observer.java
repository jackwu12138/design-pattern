package com.example.observer;

/**
 * @author jackwu
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
