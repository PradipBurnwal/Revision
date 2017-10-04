package com.app.vector;

import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 * DS - Resizable Array
	 * Default Capacity is 10 and increment by double
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		System.out.println(v.capacity());//10
		for(int i=1;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(v.capacity());//10
		v.addElement("A");
		System.out.println(v.capacity());//10
		System.out.println(v);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, A]

	}

}