package com.itc.langPack;

public class lab006Equals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st1 = new String("pradip");
		String st2 = new String("pradip");
		String st3 = new String("burnwal");
		System.out.println("Using == Op");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println("Using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
	}

}
