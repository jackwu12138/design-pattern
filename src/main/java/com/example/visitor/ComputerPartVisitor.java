package com.example.visitor;

/**
 * @author jackwu
 */
public interface ComputerPartVisitor {

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

    void visit(Computer computer);
}
