package com.jiaoshen.pro;

public class A extends Thread {
	private TestService testService;
	public A(TestService testService){
		this.testService=testService;
	}
	@Override
	public void run() {
		testService.methodA();
	}

}
