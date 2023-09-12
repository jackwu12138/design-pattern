package com.example.visitor;

/**
 * @author jackwu
 */
public class Monitor implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
