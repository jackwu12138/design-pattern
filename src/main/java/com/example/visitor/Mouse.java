package com.example.visitor;

/**
 * @author jackwu
 */
public class Mouse implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
