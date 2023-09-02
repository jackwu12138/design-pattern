package com.example.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jackwu
 */
public class ShapeCache {

    private static final Map<String, Shape> SHAPE_MAP = new HashMap<>();

    public static Shape getShape(String name) throws CloneNotSupportedException {
        Shape cachedShape = SHAPE_MAP.get(name);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        SHAPE_MAP.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        SHAPE_MAP.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        SHAPE_MAP.put(rectangle.getId(),rectangle);
    }

    public static void main(String[] args)throws CloneNotSupportedException  {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());
        clonedShape.draw();
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();
        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();
    }
}
