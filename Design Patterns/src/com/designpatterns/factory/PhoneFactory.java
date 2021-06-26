package com.designpatterns.factory;

public class PhoneFactory {

	public static Phone getPhone(PhoneType phoneType) {
		switch (phoneType) {
			case ANDROID: {
				return new AndroidPhone();
			}
			case IPHONE:{
				return new Iphone();
			}
			default:
				return null;		
		}
	}
}
