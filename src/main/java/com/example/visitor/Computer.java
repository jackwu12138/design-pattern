package com.example.visitor;

/**
 * @author jackwu
 */
public class Computer implements ComputerPart{

    private final ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[]{
                new Mouse(), new Keyboard(), new Monitor()
        };
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for (ComputerPart computerPart : this.computerParts) {
            computerPart.accept(visitor);
        }
        visitor.visit(this);
    }
}
