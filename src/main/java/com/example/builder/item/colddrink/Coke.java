package com.example.builder.item.colddrink;

/**
 * @author jackwu
 */
public class Coke extends ColdDrink{

    @Override
    public String name() {
        return "coke";
    }

    @Override
    public Float price() {
        return 4.0f;
    }
}
