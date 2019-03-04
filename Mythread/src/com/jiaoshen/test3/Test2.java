package com.jiaoshen.test3;

public class Test2 {
	public static void main(String[] args) {
		NameService service=new NameService();
		ThreadA a=new ThreadA(service);
		a.setName("A");
		a.start();
		ThreadB b=new ThreadB(service);
		b.setName("B");
		b.start();
	}

}
