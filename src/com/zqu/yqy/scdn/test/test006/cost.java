package com.zqu.yqy.scdn.test.test006;

public class cost {
	public static void main(String[] args) {
		coffee c1 = new coffee1();
		coffee c2 = new coffee2();
		coffee a1 = new sugar(c1);
		coffee a2 = new milk(c1);
		//coffee a3 = new milk(c2);
		System.out.println(a1.getCoffeeInformation()+" "+a1.cost());
		System.out.println(a2.getCoffeeInformation()+" "+a2.cost());
		//System.out.println(a3.getCoffeeInformation()+" "+a3.cost());
		
	}
	

}
