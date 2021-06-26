package com.designpatterns.abstractfactory;

public class WindowsFactory implements OSFactory {

	@Override
	public Phone create(ManufacturerType manufacturerType) {
		switch (manufacturerType) {
		case NOKIA: {
			return new NokiaPhone();
		}
		default:
			return null;
		}
	}
}
