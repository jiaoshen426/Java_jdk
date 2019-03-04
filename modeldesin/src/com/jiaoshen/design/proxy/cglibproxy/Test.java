package com.jiaoshen.design.proxy.cglibproxy;

/**
 * cglib代理的测试
 * 
 * @author jiaoshen
 * @date 2018年3月25日
 */
public class Test {
	public static void main(String[] args) {

		Cglibproxy proxy = new Cglibproxy();
		Train t = (Train) proxy.getProxy(Train.class);
		t.move();
	}
}
