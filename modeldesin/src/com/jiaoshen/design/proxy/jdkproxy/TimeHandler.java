package com.jiaoshen.design.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author jiaoshen
 * @date   2018年3月25日
 */
public class TimeHandler implements InvocationHandler {
	private  Object target;
	public TimeHandler(Object target){
		this.target=target;
	}
	
	/*
	 * 参数：
	 * arg0 被代理的对象
	 * arg1被代理对象的方法
	 * agrs2 方法的参数
	 * 
	 */
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("汽车开始行驶...，时间为1111");
		arg1.invoke(target);
		System.out.println("汽车行驶结束");
		return null;
	}

}
