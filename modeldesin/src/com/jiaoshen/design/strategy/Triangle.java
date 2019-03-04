package com.jiaoshen.design.strategy;

/**
 * 
 * @author jiaoshen
 * @date   2018年3月8日
 */
public class Triangle implements Stategy{

	@Override
	public void getArea(double i) {
		System.out.println("三角形的面积="+i*i/2);
		
	}

}
