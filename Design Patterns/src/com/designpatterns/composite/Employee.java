package com.designpatterns.composite;

public abstract class Employee {

	protected String name;
	protected Integer empId;

	public Employee(String name, Integer empId) {
		this.name = name;
		this.empId = empId;
	}
	
	public void addEmployee(Employee employee) {}
	public void removeEmployee(Employee employee) {}
	
	public abstract String display();
}
