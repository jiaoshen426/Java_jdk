package com.jiaoshen.pro;

public class Test {
	public static void main(String[] args) {
		TestService service = new TestService();
		for (int i = 0; i < 10; i++) {
			A a = new A(service);
			a.start();
			B b = new B(service);
			b.start();
		}
	}
}
