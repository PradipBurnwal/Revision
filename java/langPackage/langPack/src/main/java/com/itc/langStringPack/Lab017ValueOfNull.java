package com.itc.langStringPack;

public class Lab017ValueOfNull {

	/**
	 * As Student class contained Null without any object
	 * @param args
	 */
	public static void main(String[] args) {
		Student stud = null;
		String st1 = String.valueOf(stud);
		System.out.println(st1);
		
	}

}