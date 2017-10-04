package com.itc.langPack;

public class lab009equals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp1 = new Employee(800, "pradip");
		Employee emp2 = new Employee(800, "pradip");
		Employee emp3 = new Employee(801, "burnwal");
		Employee emp4 = emp1;
		System.out.println("Using == Op");
		System.out.println(emp1 == emp2);
		System.out.println(emp1 == emp3);
		System.out.println(emp1 == emp4);
		System.out.println(emp2 == emp3);
		
		System.out.println("Using equals() method");
		System.out.println(emp1.equals(emp2));//true when we override equals() methods otherwise false
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.equals(emp4));
		System.out.println(emp2.equals(emp3));
	}

}
