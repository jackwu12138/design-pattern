package com.example.bridge;

/**
 * @author jackwu
 */
public class Circle extends Shape {

    private final int x;

    private final int y;

    private final int radius;

    public Circle(int x, int y, int radius, DrawAPI drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        this.drawApi.drawCircle(radius, x, y);
    }

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
