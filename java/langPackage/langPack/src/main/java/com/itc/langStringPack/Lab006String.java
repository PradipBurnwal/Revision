package com.itc.langStringPack;

public class Lab006String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String st1 = "ITC ";
		String st2 = "India";
		String st3 = st1 + st2;
		String st4 = st1 + "India";
		String st5 = "ITC " + st2;
		System.out.println(st3+"\t"+st4+"\t"+st5);
		System.out.println(st3 == st4);
		System.out.println(st3 == st5);
		System.out.println(st4 == st5);
	}

}
