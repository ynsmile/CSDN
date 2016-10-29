package com.zqu.yqy.scdn.test.test003;

public class MyMethod {
	 public void testMethodA(){
		 synchronized(MyMethod.class){
			 for(int i=1;i<100;i++){
					System.out.println(i);
				} 
		 }
		
	}
	 public void testMethodB(){
		 synchronized(MyMethod.class){
		for(int i=100;i>0;i--)
		{
			System.out.println(i);
		}
	}
	 }
}
