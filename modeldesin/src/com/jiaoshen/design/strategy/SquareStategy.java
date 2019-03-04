package com.jiaoshen.design.strategy;

/**
 * 
 * @author jiaoshen
 * @date   2018年3月8日
 */
public class SquareStategy  implements Stategy{

	
	@Override
	public void getArea(double i) {
		System.out.println("正方形的面积="+i*i );
		
	}

}
