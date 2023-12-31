package com.example.interpreter;

/**
 * @author jackwu
 */
public class OrExpression implements Expression {

    private final Expression expression1;

    private final Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String context) {
        return this.expression1.interpret(context) || this.expression2.interpret(context);
    }
}
