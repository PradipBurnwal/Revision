package com.itc.langStringPack;

public class Lab016ValueOf {

	/**
	 * Convert Object to String
	 * toString() method is not overriden in Student class
	 * toString() method is overriden in Employee class
	 * @param args
	 */
	public static void main(String[] args) {
		Student stud = new Student();
		String st1 = String.valueOf(stud);
		System.out.println(st1);
		
		Employee emp = new Employee();
		String st2 = String .valueOf(emp);
		System.out.println(st2);
	}

}
