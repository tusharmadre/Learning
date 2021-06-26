package com.designpatterns.composite;

public class CompositeRunner {

	public static void main(String args[]) {
		Employee Dev1 = new Developer("Dev1", 1);
		Employee Dev2 = new Developer("Dev2", 2);
		Employee Dev3 = new Developer("Dev3", 3);
		Employee Dev4 = new Developer("Dev3", 4);
		
		Employee lead1 = new Lead("Lead1", 5);
		lead1.addEmployee(Dev1);
		lead1.addEmployee(Dev2);
		Employee lead2 = new Lead("Lead2", 6);
		lead2.addEmployee(Dev3);
		
		Employee manager = new Manager("Manager", 7);
		manager.addEmployee(lead1);
		manager.addEmployee(lead2);
		manager.addEmployee(Dev4);
		
		System.out.println(manager.display());
	}
}
