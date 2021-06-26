package com.designpatterns.decorator;

public class AndroidPhone extends SmartPhone{

	public AndroidPhone(Phone phone) {
		super(phone);
	}

	@Override
	public String build() {
		return super.build()+", "+addOS();
	}
	
	public String addOS() {
		return "Android 11";
	}
}
