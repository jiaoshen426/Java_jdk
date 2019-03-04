package com.jiaoshen.step;

import com.sun.jmx.snmp.Timestamp;

public class StepThread extends Thread {
	private Object lock;
	private volatile static int currentstep = 0;
	private int times;
	private String nameString;
	private int step; // 记录执行顺序

	public StepThread(Object lock, String nameString, int step) {
      this.lock=lock;
      this.nameString=nameString;
      this.step=step;
	}

	@Override
	public void run() {
		synchronized (lock) {
			while (true) {
				if (currentstep%3 == step) {
					System.out.println("Thread Name +" + Thread.currentThread().getName() + nameString);
					lock.notifyAll();
					currentstep++;
					break;
				}

				else {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
	}

}
