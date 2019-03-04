package com.jiaoshen.design.proxy.cglibproxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @author jiaoshen
 * @date 2018年3月25日
 */
public class Cglibproxy implements MethodInterceptor {
	private Enhancer enhancer=new Enhancer();
	
	public Object getProxy(Class calzz){
	  enhancer.setSuperclass(calzz);
	  enhancer.setCallback(this);
	  return enhancer.create();
  }
    
	/**
	 * 拦截所有目标类的方法的调用
	 * arg0 目标类的实例
	 * arg1目标方法的反射对象
	 * arg2方法的参数
	 * proxy代理类的实例
	 * 
	 */
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy proxy) throws Throwable {
         
		System.out.println("火车开始走了");
		proxy.invokeSuper(arg0, arg2);
		System.out.println("火车结束了");
		return null;
	}

}
