package com.designpatterns.facade;

public class FacadeRunner {

	public static void main(String[] args) {

		FacadePhone facadePhone = new FacadePhone();
		System.out.println(facadePhone.buildAndroidPhone());
		System.out.println(facadePhone.buildIphone());
	}

}
