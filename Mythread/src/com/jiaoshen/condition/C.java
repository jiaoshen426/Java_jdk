package com.jiaoshen.condition;

public class C extends Thread {
	private Service service;
	public C(Service service){
		this.service=service;
	}
  @Override
public void run() {
	  service.mothedC();
}
}
