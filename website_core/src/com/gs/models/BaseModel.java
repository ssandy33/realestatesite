package com.gs.models;

import java.text.NumberFormat;

public class BaseModel {
	
	protected NumberFormat currencyFmt;
	
	public BaseModel() {
		currencyFmt = NumberFormat.getCurrencyInstance();
	}

}
