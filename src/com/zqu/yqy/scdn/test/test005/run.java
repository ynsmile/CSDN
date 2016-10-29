package com.zqu.yqy.scdn.test.test005;

public class run {
public static void main(String[] args) {
	Servicer s = new Servicer();
	DrinkProduct d = new ConcreteCreator();
	s.createDrinkAddSugar(d);
	 
}
}
