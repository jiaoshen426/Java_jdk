package com.jiaoshen.design.adapter;
//通过组合方式实现适配器
public class MyAdapter    implements TargetInterface{
	 private  C c;
	 public MyAdapter(C c){
		 this.c=c;
	 }
	
	@Override
	public void fn2() {
		System.out.println("通过组合适配器");
		c.fn1();
		
	}
	 

}
