package com.itc.langStringPack;

public class Lab027CharAt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ITCIndia";
		int len = str.length();
		System.out.println(str+"\t"+len);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(len-1));
		System.out.println();
		for(int i=0;i<len;i++){
			System.out.println(i+"\t"+str.charAt(i));
		}
	}

}
