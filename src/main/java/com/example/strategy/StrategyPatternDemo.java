package com.example.strategy;

/**
 * @author jackwu
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new Context(new OperationMult());
        System.out.println("10 * 5 = " + context.execute(10, 5));
    }
}
