package com.itc.langStringPack;

public class Lab011Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;
		System.out.println("X="+x == "X="+x);//false
		final int y = 10;
		System.out.println("Y="+y == "Y="+y);//true
	}

}
