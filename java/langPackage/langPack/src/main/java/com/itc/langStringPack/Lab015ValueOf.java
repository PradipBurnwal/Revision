package com.itc.langStringPack;

public class Lab015ValueOf {

	/**
	 * convert int into string
	 * @param args
	 */
	public static void main(String[] args) {
		int ab = 98;
		//String st1 = ab;// incompartable type
		String st1 = String.valueOf(ab);
		String st2 = String.valueOf(true);
		System.out.println(st1+"\t"+st2);
	}

}
