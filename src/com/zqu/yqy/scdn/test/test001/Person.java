package com.zqu.yqy.scdn.test.test001;

public class Person extends Animal {
	Behaviour mb;
	public Person(){
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
	public void personBehaviour(){
		mb.girlsFriend();
		mb.sing();
		mb.eatBanana();
		mb.createThings();
		mb.study();
	}
}
