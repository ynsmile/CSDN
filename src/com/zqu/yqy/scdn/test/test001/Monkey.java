package com.zqu.yqy.scdn.test.test001;

public class Monkey extends Animal {
	Behaviour mb;
	public Monkey(){
		this.mb = new BehaviourImpl();
	}
	public void eat(){
		System.out.println("³Ô");
	}
	public void drink(){
		System.out.println("ºÍ");
	}
	public void la(){
		System.out.println("À­");
	}
	public void sa(){
		System.out.println("Èö");
	}
	public void monkey1Behaviour(){
		System.out.print("â¨ºï");
		mb.eatBanana();
	}
	public void monkey2Behaviour(){
		System.out.print("½ðË¿ºï");
		mb.girlsFriend();
	}
	public void monkey3Behaviour(){
		System.out.print("³¤±ÛÔ³");
		mb.sing();
	}
//	public void monkeyDaSheng(){
//		
//	}
}
