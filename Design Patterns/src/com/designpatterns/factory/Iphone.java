package com.designpatterns.factory;

public class Iphone extends Phone{

	@Override
	protected void createPhone() {
		specifications.add(new IphoneCamera());
		specifications.add(new IphoneProcessor());
		
	}

}
