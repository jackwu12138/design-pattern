package com.example.builder.item.colddrink;

/**
 * @author jackwu
 */
public class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public Float price() {
        return 30.5f;
    }
}
