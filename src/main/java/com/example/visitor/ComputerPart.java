package com.example.visitor;

/**
 * @author jackwu
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor visitor);
}
