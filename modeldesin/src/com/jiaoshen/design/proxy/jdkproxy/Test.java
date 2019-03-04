package com.jiaoshen.design.proxy.jdkproxy;

import java.beans.PropertyChangeListenerProxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDk动态代理测试类
 * @author jiaoshen
 * @date   2018年3月25日
 */
public class Test {
	public static void main(String[] args) {
		Car1 car1=new Car1();
		InvocationHandler h=new TimeHandler(car1);
		Class<?> cls=car1.getClass();
		Moveable m=(Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
		
		
	}
	

}
