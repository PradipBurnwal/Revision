package com.itc.langPack;

public class lab003toString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student st1 = null;
		System.out.println(st1);
		st1 = new Student(300, 784521365);
		System.out.println(st1);
		String str = new String("ITC Infotech");
		System.out.println(str);
		Integer ref = new Integer(123);
		System.out.println(ref);
	}

}
