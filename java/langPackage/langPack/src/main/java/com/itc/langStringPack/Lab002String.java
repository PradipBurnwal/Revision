package com.itc.langStringPack;

public class Lab002String {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "ITC";
		String str2 = new String("ITC");
		String str3 = new String("ITC");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
	}

}
