package com.designpatterns.abstractfactory;

public class AndroidFactory implements OSFactory {

	@Override
	public Phone create(ManufacturerType manufacturerType) {
		switch (manufacturerType) {
			case SAMSUNG: {
				return new SamsungPhone();
			}
			case MICROMAX: {
				return new MicromaxPhone();
			}
			default:
				return null;
			}
	}

}
