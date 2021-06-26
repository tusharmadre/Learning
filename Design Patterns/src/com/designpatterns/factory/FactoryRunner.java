package com.designpatterns.factory;

public class FactoryRunner {
	
	public static void main(String args[]) {
		Phone phone = PhoneFactory.getPhone(PhoneType.ANDROID);
		System.out.println(phone);
	}
}
