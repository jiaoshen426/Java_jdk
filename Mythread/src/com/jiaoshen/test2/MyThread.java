package com.jiaoshen.test2;

public class MyThread extends Thread {
	@Override
	public void run(){
		for (int i = 0; i < 5000; i++) {
			System.out.println("i="+i+1);
			
		}
	}
	public static void main(String[] args) {
		try {
			MyThread thread=new MyThread();
			thread.start();
			Thread.sleep(150);
			thread.interrupt();
			thread.yield();
			System.out.println("是否停止1？="+thread.interrupted());
			System.out.println("是否停止2？="+thread.interrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end!");
	}

}
