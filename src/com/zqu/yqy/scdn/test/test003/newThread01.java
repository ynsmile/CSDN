package com.zqu.yqy.scdn.test.test003;

public class newThread01 extends Thread{
	private MyMethod myMethod;

	public newThread01(MyMethod myMethod) {
		this.myMethod = myMethod;
	}
	public void run() {
		
		myMethod.testMethodB();
	}
}
