package com.designpatterns.factory;

public class AndroidProcessor implements Specification{

	@Override
	public void discription() {
		System.out.println("This is AndroidProcessor.");
		
	}

	@Override
	public String toString() {
		return "AndroidProcessor";
	}

}
