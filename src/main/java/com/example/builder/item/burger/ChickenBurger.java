package com.example.builder.item.burger;

/**
 * @author jackwu
 */
public class ChickenBurger extends Burger {

    @Override
    public Float price() {
        return 2.8f;
    }

    @Override
    public String name() {
        return "child burger";
    }
}
