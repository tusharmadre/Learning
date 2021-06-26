package com.designpatterns.composite;

public class Developer extends Employee{

	public Developer(String name, Integer empId) {
		super(name, empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		throw new UnsupportedOperationException("Developer can't add employees");
	}
	
	@Override
	public void removeEmployee(Employee employee) {
		throw new UnsupportedOperationException("Developer can't remove employees");
	}

	@Override
	public String display() {
		return "Name: "+this.name + ", EmpId: " +this.empId;
		
	}
}
