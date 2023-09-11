package com.example.observer;

/**
 * @author jackwu
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String::" + Integer.toBinaryString(this.subject.getState()));
    }
}
