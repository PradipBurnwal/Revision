package com.itc.langPack;

public class Hai {
	int x;

	public Hai(int x) {
		this.x = x;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hai-finalize");
	}
	

}
