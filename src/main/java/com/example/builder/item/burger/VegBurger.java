package com.example.builder.item.burger;

/**
 * @author jackwu
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "veg burger";
    }

    @Override
    public Float price() {
        return 20.5f;
    }
}
