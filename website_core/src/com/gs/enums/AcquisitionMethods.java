package com.gs.enums;

public enum AcquisitionMethods {
	REQUESTMLSSHOWINGFROMWEBSITE(1);
	
	private int value;
	
	private AcquisitionMethods(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
}
