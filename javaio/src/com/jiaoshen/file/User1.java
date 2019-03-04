package com.jiaoshen.file;

import java.io.Serializable;

public class User1 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer age;
	
	String nameString;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "User1 [age=" + age + ", nameString=" + nameString + "]";
	}
	 
	

}
