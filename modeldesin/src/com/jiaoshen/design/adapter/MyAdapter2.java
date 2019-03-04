package com.jiaoshen.design.adapter;

/**
 * 通过继承方式实现适配器
 * @author jiaoshen
 * @date   2018年3月7日
 */
public class MyAdapter2  extends C implements TargetInterface{

	
	@Override
	public void fn2() {
		System.out.println("通过继承方式实现适配器");
		fn1();
		
	}
    
}
