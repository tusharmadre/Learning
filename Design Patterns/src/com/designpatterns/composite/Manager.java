package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

	public Manager(String name, Integer empId) {
		super(name, empId);
	}

	public List<Employee> employees = new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	@Override
	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}

	@Override
	public String display() {
		return "Name: "+this.name + ", EmpId: " +this.empId + ", Employees: ["+empList()+"]";
	}
	
	public String empList() {
		String str = "";
		for(Employee employee: this.employees)
			str+=employee.display();
		return str;
	}
}
