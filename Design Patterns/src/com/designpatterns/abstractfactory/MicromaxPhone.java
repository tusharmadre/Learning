package com.designpatterns.abstractfactory;

public class MicromaxPhone implements Phone {

	@Override
	public void display() {
		System.out.println("This is MicromaxPhone.");
	}

	@Override
	public String toString() {
		return "MicromaxPhone";
	}
}
