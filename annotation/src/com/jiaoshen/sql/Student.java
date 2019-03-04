package com.jiaoshen.sql;
@Table("STU")
public class Student {
	@Column(name = "ID")
    private Integer ID;
	private Integer age;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
