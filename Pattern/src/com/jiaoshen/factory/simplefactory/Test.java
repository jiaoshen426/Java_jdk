package com.jiaoshen.factory.simplefactory;

import com.jiaoshen.factory.bean.Tea;

/**
 * @author jiaoshen
 */
public class Test {
	public static void main(String[] args) {
		Tea myTea=SimpleFactory.createTea("green");
		System.out.println(myTea);
		
	}

}
