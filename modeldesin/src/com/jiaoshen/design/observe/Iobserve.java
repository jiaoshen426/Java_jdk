package com.jiaoshen.design.observe;

public class Iobserve {
	 private String name;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void update(String wea){
		 System.out.println(getName()+wea);
	 }

}
