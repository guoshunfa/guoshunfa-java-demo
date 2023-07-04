package code4.builder;

import code4.service.impl.*;

/**
 * @className: MealBuilder
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
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
