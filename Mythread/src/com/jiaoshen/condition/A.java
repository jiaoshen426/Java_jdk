package com.jiaoshen.condition;

public class A extends Thread {
	private Service service;
	public A(Service service){
		this.service=service;
	}
  @Override
public void run() {
	  service.mothedA();
}
}
