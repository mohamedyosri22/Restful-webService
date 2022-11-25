package com.spring.restful.model;

public class Student {

	private int id;
	
	private String name;
	
	private String phone;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public Student(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
