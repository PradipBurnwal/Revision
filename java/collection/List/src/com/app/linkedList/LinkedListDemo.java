package com.app.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * 
	 * @param args
	 * Data Structure used is Double LinkedList
	 * No Implementation from RandomAccess Interface
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("Durga");
		l.add("20");
		l.add(null);
		l.add("Durga");//[Durga, 20, null, Durga]
		l.set(0, "Software");//delete the previous and update the new at same index [Software, 20, null, Durga]
		l.add(0, "Venkey");//[Venkey, Software, 20, null, Durga]
		l.removeLast();//[Venkey, Software, 20, null]
		
		l.addFirst("CCC");//[CCC, Venkey, Software, 20, null]
		System.out.println(l.getFirst());//
		System.out.println(l.getLast());//null
		l.removeLast();//[CCC, Venkey, Software, 20]
		
		System.out.println(l);
		
	}

}
