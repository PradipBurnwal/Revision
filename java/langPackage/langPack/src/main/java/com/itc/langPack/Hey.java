package com.itc.langPack;

public class Hey {
	void show(){
		System.out.println("show()");
	}
	void m1(){
		System.out.println("m1-start");
		Hai hai1 = new Hai(10);
		Hai hai2 = new Hai(20);
		Hai hai3 = new Hai(30);
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hey-finalize");
	}
	
}
