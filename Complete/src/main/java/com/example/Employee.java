package com.example;


public class Employee {
	private int ID;
	private String name;
	
	public Employee() {}

	public Employee(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + "]";
	}
	
}
