package com.designpatterns.abstractfactory;

public class AbstractFactoryRunner {

	public static void main(String args[]) {
		Phone phone = AbstractPhoneFactory.getFactory(OSType.ANDROID).create(ManufacturerType.MICROMAX);
		System.out.println(phone);
	}
}
