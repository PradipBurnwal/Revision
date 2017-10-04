package com.itc.langStringPack;

import java.util.Scanner;

public class Lab004Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "ITC";
		String str2 = "ITC";
		System.out.println(str1 == str2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str3 = sc.nextLine();
		System.out.println("Enter Second String");
		String str4 = sc.nextLine();
		System.out.println(str3 == str4);// referance comparision
		System.out.println(str3.intern() == str4.intern());// contained comparision
	}

}
