package com.jiaoshen.test3;

public class ThreadA extends Thread {
	private NameService service;
	public ThreadA(NameService service){
		this.service=service;
	}
	@Override
	public void run() {
		service.getk1();
		
	}

}
