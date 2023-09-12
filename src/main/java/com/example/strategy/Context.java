package com.example.strategy;

/**
 * @author jackwu
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2){
        return this.strategy.doOperation(num1, num2);
    }
}
