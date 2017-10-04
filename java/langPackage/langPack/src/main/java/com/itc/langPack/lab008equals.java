package com.itc.langPack;

public class lab008equals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = new Student(700, 98765432);
		Student st2 = new Student(700, 98765432);
		Student st3 = new Student(701, 98654732);
		Student st4 = st1;
		System.out.println("Using == Op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);
		
		System.out.println("Usung equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));
	}

}
