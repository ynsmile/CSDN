package com.zqu.yqy.scdn.test.test002;

public class FaceInterface {
	public void fightTheLandlord(){
		Person p1 = new farmer1();
		Person p2 = new farmer2();
		Person p3 = new landHolder();
		System.out.println("斗地主开始。。。。。。。");
		System.out.println("谁是农民？");
		p1.showInformation();
		p2.showInformation();
		System.out.println("谁是地主？");
		p3.showInformation();
		System.out.println("知道谁是地主后，我们开始打牌吧。。。");
	}

}
