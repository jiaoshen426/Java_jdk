package com.jiaoshen.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * @author jiaoshen
 *
 */
public class Client {
	public static void main(String[] args) {
		Movable car = new Car();
		InvocationHandler myHandler = new TimeHandler(car);
		
		Movable carProxy=(Movable)Proxy.newProxyInstance(car.getClass().getClassLoader(),car.getClass().getInterfaces() , myHandler);
		carProxy.move();
	}

}
