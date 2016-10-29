package com.zqu.yqy.scdn.test.test005;

public class Servicer {
	AddWhat addWhat = null;
	AddWhat addMilk = null;
	Drink drink = null;
	
	public void makeDrinkAddSugar(DrinkProduct drinkProduct){
		createDrinkAddSugar(drinkProduct);
	}
	public void createDrinkAddSugar(DrinkProduct drinkProduct){
		this.addWhat = drinkProduct.createAdd();
		this.drink = drinkProduct.createDrink();
		this.addMilk = drinkProduct.createAddMilk();
		this.addMilk.addWhat();
		this.addWhat.addWhat();
		this.drink.whatDrink();
	}
}
