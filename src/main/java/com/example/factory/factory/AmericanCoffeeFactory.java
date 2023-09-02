package com.example.factory.factory;

import com.example.factory.coffee.AmericanoCoffee;
import com.example.factory.coffee.Coffee;

/**
 * @author jackwu
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }
}
