package com.example.abstractfactory.factory;

import com.example.abstractfactory.product.coffee.Coffee;
import com.example.abstractfactory.product.dessert.Dessert;

/**
 * @author jackwu
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
