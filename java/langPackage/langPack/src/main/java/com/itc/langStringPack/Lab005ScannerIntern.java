package com.itc.langStringPack;

import java.util.Scanner;

public class Lab005ScannerIntern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "ITC";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String str2 = sc.nextLine();
		System.out.println("Re-Enter Same String :");
		String str3 = sc.nextLine();
		String str5 = str2.intern();
		String str6 = str3.intern();
		System.out.println(str2 == str3);
		System.out.println(str5 == str6);
		System.out.println(str1 == str5);
	}

}
