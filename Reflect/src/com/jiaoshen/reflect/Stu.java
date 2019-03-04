package com.jiaoshen.reflect;

public class Stu {
	private String name;
	private int age;
	
	public Stu(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getDouble(Integer i){
		System.out.println("i*2="+i*2);
	}
	public void getDouble(Integer i,Integer j){
		System.out.println("i+j="+i+j);
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + "]";
	}
	
	

}
