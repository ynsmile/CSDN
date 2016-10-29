package com.zqu.yqy.scdn.test.test004;

public class run {
public static void main(String[] args) {
	DrinkProduct d = new ConcreteCreator();
	 Drink d1 = d.createDrink("tea");
	 Drink d2 = d.createDrink("coffee");
	 Drink d3 = d.createDrink("juice");
	 d1.whatDrink();
	 d2.whatDrink();
	 d3.whatDrink();
	 
}
}
