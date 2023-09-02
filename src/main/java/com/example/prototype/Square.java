package com.example.prototype;

/**
 * @author jackwu
 */
public class Square extends Shape {

    public Square() {
        this.type = "square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
