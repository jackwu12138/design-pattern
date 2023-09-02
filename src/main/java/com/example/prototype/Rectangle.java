package com.example.prototype;

/**
 * @author jackwu
 */
public class Rectangle extends Shape {

    public Rectangle() {
        this.type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
