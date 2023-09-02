package com.example.abstractfactory.factory;

import com.example.abstractfactory.product.coffee.AmericanoCoffee;
import com.example.abstractfactory.product.coffee.Coffee;
import com.example.abstractfactory.product.dessert.Dessert;
import com.example.abstractfactory.product.dessert.MatchaMousse;

/**
 * @author jackwu
 */
public class AmericanDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanoCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
