package com.example.factory.coffee;

import com.example.factory.factory.CoffeeFactory;

/**
 * @author jackwu
 */
public class CoffeeStore {
    private final CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(String type) {
        return factory.createCoffee();
    }
}
