package com.zqu.yqy.scdn.test.test001;

public class main {

	public static void main(String[] args) {
		Monkey m = new Monkey();
		Person p = new Person();
		System.out.println("人具有的基本行为：");
		System.out.println("------------");
		p.eat();
		p.drink();
		p.la();
		p.sa();
		System.out.println("------------");
		System.out.println("其他的行为：");
		System.out.println("------------");
		p.personBehaviour();
		System.out.println("------------");
		System.out.println("猴子具有的基本行为：");
		System.out.println("------------");
		m.eat();
		m.drink();
		m.la();
		m.sa();
		System.out.println("------------");
		System.out.println("不同猴子有不同的行为");
		System.out.println("------------");
		m.monkey1Behaviour();
		m.monkey2Behaviour();
		m.monkey3Behaviour();
		System.out.println("------------");
	}

}
