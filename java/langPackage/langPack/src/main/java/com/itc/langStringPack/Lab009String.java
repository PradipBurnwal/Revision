package com.itc.langStringPack;

public class Lab009String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st1 = "ITC99";
		final String st2 = "ITC";
		final int ab = 99;
		String st3 = st2 + ab;
		String st4 = "ITC"+99;
		System.out.println(st1+"\t"+st3+"\t"+st4);
		System.out.println(st1 == st3);//true as both st2 and ab are final means constant
		System.out.println(st1 == st4);//true
	}

}
