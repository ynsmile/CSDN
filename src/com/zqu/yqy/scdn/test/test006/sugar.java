package com.zqu.yqy.scdn.test.test006;

public class sugar extends AddThings {
	coffee coff;
	public sugar(coffee c) {
		this.coff = c;
	}
	@Override
	public String getCoffeeInformation() {
		String addThings = coff.getCoffeeInformation()+"Ìí¼Ó"+"sugar";
		return addThings;
	}

	@Override
	public double cost() {
		
		return 2.0+coff.cost();
	}
	

}
