package com.itc.langStringPack;

public class Lab021StartWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hai, Welcome to this World";
		System.out.println(str.startsWith("Hai"));//true
		System.out.println(str.startsWith("Welcome"));//false
		System.out.println(str.startsWith("Welcome",5));//true
	}

}
