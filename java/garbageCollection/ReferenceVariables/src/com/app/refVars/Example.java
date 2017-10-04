package com.app.refVars;

public class Example {
	//static reference variable
	static Example e1,e2;
	
	//non-static reference variable
	Example e3, e4;
	
	public static void main(String[] args) {
		//local variable
		Example e5, e6;
		
		//object creation with local variable;
		Example e7 = new Example();
		
		System.out.println("e1: "+e1);
		System.out.println("e2: "+e2);
		
		//Cannot make a static reference to the non-static field e3 and e4
		/*System.out.println("e3: "+e3);
		System.out.println("e4: "+e4);*/
		
		System.out.println(e7.e3);
		System.out.println(e7.e3);
		
		//local variable can't access without accessing
		/*System.out.println(e5);
		System.out.println(e6);*/
		
		e5 = new Example();
		e6 = null;
		
		System.out.println("e5 : "+e5);
		System.out.println("e6 : "+e6);
	}

}