package com.itc.langPack;

public class lab002Hashcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n***With Student");
		Student st1 = new Student(1, 45214521);
		Student st2 = new Student(2, 45214522);
		Student st3 = new Student(3, 78548543);
		Student st4 = st1;
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st3.hashCode());
		System.out.println(st4.hashCode());
		
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st3==st4);
	}

}
