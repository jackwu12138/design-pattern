package com.example.facade;

/**
 * @author jackwu
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw::square");
    }
}
