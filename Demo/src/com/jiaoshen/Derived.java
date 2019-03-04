package com.jiaoshen;

public class Derived extends Base {
	int count = 20;
	@Override
	 public void display(){
  	   System.out.println(this.count);
     }
	@Override
	public void fn() {
		System.out.println("我是子方法");
		
	}
	public void fn2(){
		super.fn();
	}
  private void synchronize() {
	// TODO Auto-generated method stub

}{
	  
  }
}
