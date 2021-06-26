package com.designpatterns.adapter;

public class AdapterRunner {

	public static void main(String[] args) {
		AndroidCharger androidCharger = new AndroidCharger();
		AndroidPhone androidPhone = new SamsungA71();
		androidCharger.charge(androidPhone);
		
		IphoneCharger iphoneCharger = new IphoneCharger();
		AndroidToIphoneAdapter androidToIphoneAdapter = new AndroidToIphoneAdapter(androidPhone);
		iphoneCharger.charge(androidToIphoneAdapter);
		
	}

}
