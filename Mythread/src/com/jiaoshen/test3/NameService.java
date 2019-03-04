package com.jiaoshen.test3;

public class NameService {
	private String userNameString;
	private  int k1=0;
    private String aString =new String();
	public void SetName() {
		try {
			synchronized (this) {
				System.out.println("线程名称为：" + Thread.currentThread().getName() + System.currentTimeMillis() + "进入同步块");

				Thread.sleep(200);

				System.out.println("线程名称为：" + Thread.currentThread().getName() + System.currentTimeMillis() + "进离开步块");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void SetName1() {
		try {
//			synchronized (aString) {
				System.out.println("线程名称为：" + Thread.currentThread().getName() + System.currentTimeMillis() + "进入同步块");

				Thread.sleep(200);

				System.out.println("线程名称为：" + Thread.currentThread().getName() + System.currentTimeMillis() + "进离开步块");
//			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getk1(){
		for(int i=0;i<10;i++){
			k1++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("getk1==="+k1);
			
		}
		
	}
	public void getk2(){
		System.out.println("get2开始");
	         while (k1<5) {
				
	        	 try {
	        		 Thread.sleep(200);
	        	 } catch (InterruptedException e) {
	        		 // TODO Auto-generated catch block
	        		 e.printStackTrace();
	        	 }
			}
			System.out.println("getk2===结束了"+k1);
			
		
		
	}
}
