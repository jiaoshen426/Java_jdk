package com.jiaoshen.condition;

import sun.net.www.content.audio.basic;

public class Test {
    public static void main(String[] args) {
		Service service=new Service();
		C c=new C(service);
		c.setName("C");
		A a=new A(service);
		a.setName("A");
		B b=new B(service);
		b.setName("B");
		c.start();
		try {
			Thread.sleep(100);
		
		a.start();
		Thread.sleep(100);
		b.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
