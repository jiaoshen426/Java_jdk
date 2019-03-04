package com.jiaoshen.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
   private Movable car;
   
   public TimeHandler(Movable car) {
	this.car=car;
}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long start=System.currentTimeMillis();
		System.out.println("汽车开车前"+start);
		method.invoke(car);
		long end=System.currentTimeMillis();
		System.out.println("汽车开车后"+end);
		return null;
	}

}
