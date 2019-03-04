package com.jiaoshen.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private Lock lock=new ReentrantLock();
	public Condition condition1=lock.newCondition();
	public Condition condition2=lock.newCondition();
	public void mothedA(){
		lock.lock();
		System.out.println(Thread.currentThread().getName()+"线程执行");
		condition1.signalAll();
		lock.unlock();
	}
	public void mothedB(){
		lock.lock();
		System.out.println(Thread.currentThread().getName()+"线程执行");
		condition2.signalAll();
		lock.unlock();
	}
	public void mothedC(){
		lock.lock();
		try {
			condition1.await();
			condition2.await();
			System.out.println(Thread.currentThread().getName()+"线程执行");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lock.unlock();
	}
}
