package com.designpatterns.facade;

public class FacadePhone {

	private Iphone iphone;
	private AndroidPhone androidPhone;
	
	public FacadePhone() {
		this.iphone = new Iphone();
		this.androidPhone = new AndroidPhone();
	}
	
	public String buildIphone() {
		return this.iphone.build();
	}
	
	public String buildAndroidPhone() {
		return this.androidPhone.build();
	}

}
