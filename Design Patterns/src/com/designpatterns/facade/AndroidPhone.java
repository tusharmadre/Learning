package com.designpatterns.facade;

public class AndroidPhone implements Phone{

	@Override
	public String build() {
		return "Built using Android.";
	}

}
