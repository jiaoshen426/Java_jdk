package com.jiaoshen.join;

public class D extends Thread {
	

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		System.out.println("D开始执行=======");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("D结束执行=======");
	}
}
