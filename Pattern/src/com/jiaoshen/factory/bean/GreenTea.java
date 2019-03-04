package com.jiaoshen.factory.bean;

public class GreenTea implements Tea{
    
	public GreenTea(){
		info();
	}
	@Override
	public void info() {
	System.out.println("I'am Green Tea");
	}

}
