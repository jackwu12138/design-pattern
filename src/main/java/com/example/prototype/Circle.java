package com.example.prototype;

/**
 * @author jackwu
 */
public class Circle extends Shape{

    public Circle() {
        this.type = "circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
