package com.designpatterns.adapter;

public class AndroidToIphoneAdapter implements Iphone{

	public AndroidPhone androidPhone;
	
	public AndroidToIphoneAdapter(AndroidPhone androidPhone) {
		this.androidPhone = androidPhone;
	}
	@Override
	public void charge() {
		androidPhone.charge();	
	}
}
