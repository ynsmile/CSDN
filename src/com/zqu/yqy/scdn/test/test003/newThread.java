package com.zqu.yqy.scdn.test.test003;

public class newThread extends Thread{
	private MyMethod myMethod;

	public newThread(MyMethod myMethod) {
		this.myMethod = myMethod;
	}

	public void run() {
		myMethod.testMethodA();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
