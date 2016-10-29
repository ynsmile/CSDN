package com.zqu.yqy.scdn.test.test006;

public class milk extends AddThings{
	coffee coff;
	public milk(coffee c) {
		this.coff = c;
	}

	@Override
	public String getCoffeeInformation() {
		String addThings = coff.getCoffeeInformation()+"Ìí¼Ó"+"milk";
		return addThings;
	}

	@Override
	public double cost() {
	
		return 3.0+coff.cost();
	}

}
