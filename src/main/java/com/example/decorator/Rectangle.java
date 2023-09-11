package com.example.decorator;

/**
 * @author jackwu
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw::rectangle");
    }
}
