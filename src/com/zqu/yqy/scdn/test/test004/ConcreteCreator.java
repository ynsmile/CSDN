package com.zqu.yqy.scdn.test.test004;

public class ConcreteCreator implements DrinkProduct {
	Drink drink = null;

	@Override
	public Drink createDrink(String DrinkName) {
		if (DrinkName == "tea") {
			return drink = new tea();
		} else if (DrinkName == "coffee") {

			return drink = new coffee();

		} else if (DrinkName == "juice") {

			return drink = new juice();
		}
		return drink;
	}

}
