package com.itc.langStringPack;

public class Lab031charToString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char cArr[] = {'I','T','C','I','N','D','I','A'};
		byte bArr[] = {65,66,67,97,98,99,48,49,50};
		String st1 = new String(cArr);
		String st2 = new String(bArr);
		System.out.println("st1 : "+st1);
		System.out.println("st2 : "+st2);
		System.out.println();
		String st3 = new String(cArr,3,4);
		String st4 = new String(bArr,3,4);
		System.out.println(st3);
		System.out.println(st4);
	}

}
