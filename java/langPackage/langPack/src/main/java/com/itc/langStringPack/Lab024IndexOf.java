package com.itc.langStringPack;

public class Lab024IndexOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Welcome to ITC,Indian Tobaco Company, No 1 in Tobaco Producer and Manketing";
		System.out.println(str.indexOf(101));
		System.out.println(str.indexOf(99));
		System.out.println(str.indexOf('a'));
		System.out.println();
		System.out.println(str.indexOf('W'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a',26));
		System.out.println(str.indexOf('a',65));
		System.out.println(str.indexOf('a',68));//-1 as there is no 'a' char after index 67
	}

}
