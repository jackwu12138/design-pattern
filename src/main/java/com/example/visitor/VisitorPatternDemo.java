package com.example.visitor;

/**
 * @author jackwu
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputerPart cp = new Computer();
        cp.accept(new ComputerPartDisplayVisitor());
    }
}
