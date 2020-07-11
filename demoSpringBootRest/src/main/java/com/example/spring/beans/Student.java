package com.example.spring.beans;

public class Student {
	String name;
	int age;
	String regNo;
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
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public Student(String name, int age, String regNo) {
		super();
		this.name = name;
		this.age = age;
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", regNo=" + regNo + "]";
	}

}
