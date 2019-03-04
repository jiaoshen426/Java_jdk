package com.jiaoshen.pro;
/**
 * 
 * @author jiaoshen
 * 20个线程 10个A类型，10个B类型
 * 让他们交替进行
 *
 */
public class TestService {
	private volatile  boolean flag=false;
	synchronized public void methodA(){
		try {
		while (flag) {
				wait();
			} 
			System.out.println("AAAAA");
		flag=true;
		notifyAll();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	synchronized public void methodB(){
		try {
		while (!flag) {
				wait();
			} 
			System.out.println("BBBBB");
		flag=false;
		notifyAll();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
