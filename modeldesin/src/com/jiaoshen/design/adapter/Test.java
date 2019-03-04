package com.jiaoshen.design.adapter;

/**
 * 
 * @author jiaoshen
 * @date   2018年3月7日
 */
public class Test {
  public static void main(String[] args) {
	  /**
	   * 继承的方式实现适配器
	   */
	MyAdapter2 ada=new MyAdapter2();
	ada.fn2();
	/**
	 * 引用的方式实现适配器
	 */
	
	MyAdapter ada2=new MyAdapter(new C());
	ada2.fn2();
}
}
