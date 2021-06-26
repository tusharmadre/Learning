package com.designpatterns.decorator;

public class DecoratorExample {

	public static void main(String args[]) {
		Phone phone = new AndroidPhone(new BasicPhone());
		System.out.println(phone.build());
	}
}
