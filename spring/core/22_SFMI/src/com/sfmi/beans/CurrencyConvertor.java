package com.sfmi.beans;

public class CurrencyConvertor {
	private static CurrencyConvertor instance;

	public CurrencyConvertor() {
		//no code
	}
	
	private static synchronized CurrencyConvertor getInstance(){
		return new CurrencyConvertor();
	}
	
}
