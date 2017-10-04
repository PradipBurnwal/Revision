package com.app.arrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {

	/**
	 * @param args
	 * Dta Structure used by ArrayList is Resizable Array or Growable Array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);//[A, 10, A, null]
		
		l.remove(2);
		System.out.println(l);//[A, 10, null]
		
		l.add(2,"M");
		l.add("N");
		System.out.println(l);//[A, 10, M, null, N]
		
		l.add(null);
		System.out.println(l);//[A, 10, M, null, N, null]
		
		LinkedList l2 = new LinkedList();
		
		System.out.println(l instanceof Serializable);//true
		System.out.println(l instanceof Cloneable);//true
		System.out.println(l instanceof RandomAccess);//true
		
		System.out.println(l2 instanceof Serializable);//true
		System.out.println(l2 instanceof Cloneable);//true
		System.out.println(l2 instanceof RandomAccess);//false
		
	}

}
