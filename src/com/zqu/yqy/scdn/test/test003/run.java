package com.zqu.yqy.scdn.test.test003;

public class run {
	public static void main(String[] args) {
		MyMethod my = new MyMethod();
		newThread t1 = new newThread(my);
		newThread01  t2 = new newThread01(my);
		t1.start();
		t2.start();
	}

}
