package com.itc.langStringPack;

public class Lab014CompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("ABC".compareTo("ABC"));
		System.out.println("ABC".compareTo("ADO"));
		System.out.println("ABC".compareTo("ABCDEFG"));
		System.out.println("ABCDEFG".compareTo("ABC"));
		System.out.println("ABC".compareTo("DEF"));
		System.out.println("ABC".compareTo("abc"));
		System.out.println("abc".compareTo("ABC"));
		System.out.println("ABC".compareToIgnoreCase("abc"));
	}

}