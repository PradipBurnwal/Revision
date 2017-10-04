package com.itc.langStringPack;

public class Lab022EndWith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hai, Welcome to ITC";
		System.out.println(str.endsWith("ITC"));//true
		System.out.println(str.endsWith("Welcome"));//false
		System.out.println();
		System.out.println(str.startsWith(""));//true
		System.out.println(str.endsWith(""));//true
	}

}
