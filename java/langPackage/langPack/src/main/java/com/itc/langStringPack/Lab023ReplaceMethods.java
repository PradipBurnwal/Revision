package com.itc.langStringPack;

public class Lab023ReplaceMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hi, welcome to ITC(Indian Tobaco Company), Indian World";
		String str1 = str.replace("I", "P");
		System.out.println(str1);
		String str2 = str.replaceFirst("Indian", "Pradip");
		System.out.println(str2);
		String str3 = str.replaceAll("Indian", "Pradip");
		System.out.println(str3);
	}

}