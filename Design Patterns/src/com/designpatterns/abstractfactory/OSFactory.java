package com.designpatterns.abstractfactory;

public interface OSFactory {

	Phone create(ManufacturerType manufacturerType);
}
