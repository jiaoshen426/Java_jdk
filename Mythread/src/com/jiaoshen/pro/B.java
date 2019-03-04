package com.jiaoshen.pro;

public class B extends Thread {
	private TestService testService;
	public B(TestService testService){
		this.testService=testService;
	}
	@Override
	public void run() {
		testService.methodB();
	}
}
