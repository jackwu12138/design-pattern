package com.example.flyweight;

/**
 * @author jackwu
 */
public class Circle implements Shape {

    private int x;

    private int y;

    private int radius;

    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw()");
        System.out.println(this );
    }

    @Override
    public String toString() {
        return "[Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius;
    }
}
