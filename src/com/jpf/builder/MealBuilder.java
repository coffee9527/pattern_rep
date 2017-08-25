package com.jpf.builder;

import com.jpf.builder.base.domain.ChickenBurger;
import com.jpf.builder.base.domain.Coffee;
import com.jpf.builder.base.domain.Tea;
import com.jpf.builder.base.domain.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coffee());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Tea());
		return meal;
	}
}
