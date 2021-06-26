package com.designpatterns.decorator;

public class BasicPhone implements Phone{

	@Override
	public String build() {
		return "This is basic phone";
	}

}
