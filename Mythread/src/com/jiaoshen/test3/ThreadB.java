package com.jiaoshen.test3;

public class ThreadB extends Thread {
	private NameService service;
	public ThreadB(NameService service){
		this.service=service;
	}
	@Override
	public void run() {
		service.getk2();
		
	}

}
