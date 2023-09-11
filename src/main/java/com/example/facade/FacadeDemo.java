package com.example.facade;

/**
 * @author jackwu
 */
public class FacadeDemo {

    public static void main(String[] args) {
        var maker = new ShapeMaker();
        maker.drawCircle();
        maker.drawSquare();
    }
}
