package com.zqu.yqy.scdn.test.test001;

public class main {

	public static void main(String[] args) {
		Monkey m = new Monkey();
		Person p = new Person();
		System.out.println("�˾��еĻ�����Ϊ��");
		System.out.println("------------");
		p.eat();
		p.drink();
		p.la();
		p.sa();
		System.out.println("------------");
		System.out.println("��������Ϊ��");
		System.out.println("------------");
		p.personBehaviour();
		System.out.println("------------");
		System.out.println("���Ӿ��еĻ�����Ϊ��");
		System.out.println("------------");
		m.eat();
		m.drink();
		m.la();
		m.sa();
		System.out.println("------------");
		System.out.println("��ͬ�����в�ͬ����Ϊ");
		System.out.println("------------");
		m.monkey1Behaviour();
		m.monkey2Behaviour();
		m.monkey3Behaviour();
		System.out.println("------------");
	}

}
