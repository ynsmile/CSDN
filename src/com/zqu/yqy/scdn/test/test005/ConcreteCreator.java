package com.zqu.yqy.scdn.test.test005;

public class ConcreteCreator implements DrinkProduct {

	@Override
	public Drink createDrink() {
		return new coffee();
	}
	
	@Override
	public AddWhat createAdd() {
		return new AddSugar();
	}
	public AddWhat createAddMilk(){
		return new AddMilk();
	}

}
