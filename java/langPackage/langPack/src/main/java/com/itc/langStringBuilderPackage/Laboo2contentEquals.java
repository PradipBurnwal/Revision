package com.itc.langStringBuilderPackage;

public class Laboo2contentEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str  = "ITC";
		StringBuilder sb = new StringBuilder("ITC");
		System.out.println(str.contentEquals(sb));//true
		System.out.println();
		System.out.println(str.hashCode());
		System.out.println(sb.hashCode());
	}

}
