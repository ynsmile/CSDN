package com.zqu.yqy.scdn.test.test001;

public class Monkey extends Animal {
	Behaviour mb;
	public Monkey(){
		this.mb = new BehaviourImpl();
	}
	public void eat(){
		System.out.println("��");
	}
	public void drink(){
		System.out.println("��");
	}
	public void la(){
		System.out.println("��");
	}
	public void sa(){
		System.out.println("��");
	}
	public void monkey1Behaviour(){
		System.out.print("⨺�");
		mb.eatBanana();
	}
	public void monkey2Behaviour(){
		System.out.print("��˿��");
		mb.girlsFriend();
	}
	public void monkey3Behaviour(){
		System.out.print("����Գ");
		mb.sing();
	}
//	public void monkeyDaSheng(){
//		
//	}
}
