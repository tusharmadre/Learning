package com.designpatterns.builder;

public class BuilderRunner {

	public static void main(String args[]) {
		Phone.Builder builder = new Phone.Builder().camera("48MP").processor("Octacore").ram("16GB");
		Phone phone = builder.build();
		System.out.println(phone);
	}
}
