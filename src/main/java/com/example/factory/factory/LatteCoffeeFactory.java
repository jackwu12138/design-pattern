package com.example.factory.factory;

import com.example.factory.coffee.Coffee;
import com.example.factory.coffee.LatteCoffee;

/**
 * @author jackwu
 */
public class LatteCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
