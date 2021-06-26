package com.designpatterns.adapter;

public class SamsungA71 implements AndroidPhone{

	@Override
	public void charge() {
		System.out.println("A71 is charging...");
		
	}

}
