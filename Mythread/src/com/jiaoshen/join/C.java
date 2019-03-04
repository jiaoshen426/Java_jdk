package com.jiaoshen.join;

public class C extends Thread {
	private D d;

	public C(D d) {
		this.d = d;

	}

	@Override
	public void run() {
		synchronized (d) {
			
		
		// TODO Auto-generated method stub
		System.out.println("C开始执行=======");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("C结束执行=======");
		}
	}
}
