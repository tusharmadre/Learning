package com.designpatterns.factory;

public class AndroidPhone extends Phone{

	@Override
	protected void createPhone() {
		specifications.add(new AndroidCamera());
		specifications.add(new AndroidProcessor());
	}

}
