package com.jiaoshen.condition;

public class B extends Thread {
	private Service service;
	public B(Service service){
		this.service=service;
	}
  @Override
public void run() {
	  service.mothedB();
}
}
