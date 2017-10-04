package com.itc.langPack;

public class Lab012GC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Hey().show();
		Hey h1 = new Hey();
		h1 = null;
		Hey h2 = new Hey();
		Hey h3 = new Hey();
		h2 = h3;
		new Hey().m1();
		//System.runFinalization();
		System.gc();
	}

}
