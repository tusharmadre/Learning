package com.designpatterns.facade;

public class Iphone implements Phone{

	@Override
	public String build() {
		return "Built using IOS.";
	}

}
