package com.jiaoshen.design.proxy.jdkproxy;

/**
 * 
 * @author jiaoshen
 * @date   2018年3月25日
 */
public class Car1 implements Moveable {

	@Override
	public void move() {
		System.out.println("我是卡车，我在行走");
		
	}

}
