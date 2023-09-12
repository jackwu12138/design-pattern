package com.example.strategy;

/**
 * @author jackwu
 */
public class OperationSub implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
