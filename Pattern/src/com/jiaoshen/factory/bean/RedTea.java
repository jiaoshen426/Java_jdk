package com.jiaoshen.factory.bean;

public class RedTea implements Tea{
	
	public RedTea(){
		info();
	}

	@Override
	public void info() {
		System.out.println("I'am RedTea");
		
	}
    
}
