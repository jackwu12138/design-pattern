package com.example.builder.meal;

import com.example.builder.item.burger.ChickenBurger;
import com.example.builder.item.burger.VegBurger;
import com.example.builder.item.colddrink.Coke;
import com.example.builder.item.colddrink.Pepsi;

/**
 * @author jackwu
 */
public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}
