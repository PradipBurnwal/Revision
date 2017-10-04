package com.itc.langStringPack;

public class Lab013Equal {

	/**
	 * Equals and "==" operator difference
	 * @param args
	 */
	public static void main(String[] args) {
		String st1 = new String("ITC");
		String st2 = new String("ITC");
		String st3 = new String("itc");
		System.out.println(st1+"\t"+st2+"\t"+st3);
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println();
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equalsIgnoreCase(st3));
	}

}
