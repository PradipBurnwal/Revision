package com.itc.langPack;

public class lab001getClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		showClassInfo("JLC");
		Student std = new Student(10,25632541);
		showClassInfo(std);
		Person person = new Person();
		showClassInfo(person);
		
	}
	static void showClassInfo(Object obj){
		Class cls = obj.getClass();
		System.out.println("Class Name:"+cls.getName());
		Class scls = cls.getSuperclass();
		if(scls!=null)
			System.out.println("Super Class:"+scls.getName());
		else
			System.out.println("No Super Class");
		
	}

}
