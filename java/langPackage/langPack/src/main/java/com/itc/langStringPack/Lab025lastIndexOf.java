package com.itc.langStringPack;

public class Lab025lastIndexOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Welcome to ITC,Indian Tobaco Company, No 1 Indian Producer and Manketing.";
		System.out.println(str);
		System.out.println(str.lastIndexOf(97));
		System.out.println(str.lastIndexOf('a'));
		System.out.println();
		System.out.println(str.lastIndexOf("Indian"));
		System.out.println(str.lastIndexOf("Indian",43));
		System.out.println(str.lastIndexOf("Indian",42));
	}

}
