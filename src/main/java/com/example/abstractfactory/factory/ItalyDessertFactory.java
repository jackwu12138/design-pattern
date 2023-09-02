package com.example.abstractfactory.factory;

import com.example.abstractfactory.product.coffee.Coffee;
import com.example.abstractfactory.product.coffee.LatteCoffee;
import com.example.abstractfactory.product.dessert.Dessert;
import com.example.abstractfactory.product.dessert.Tiramisu;

/**
 * @author jackwu
 */
public class ItalyDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
