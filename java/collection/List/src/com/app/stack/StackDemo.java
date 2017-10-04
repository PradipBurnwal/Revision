package com.app.stack;

import java.util.Stack;

public class StackDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push("Durga");
		s.push(20);
		s.push("Software");
		System.out.println(s);//[Durga, 20, Software]
		System.out.println(s.pop());//Software
		System.out.println(s);//[Durga, 20]
		System.out.println(s.peek());//20
		System.out.println(s);//[Durga, 20]
		
		System.out.println(s.search("Durga"));//2
		System.out.println(s.search(20));//1
		System.out.println(s.search("Pradip"));//-1
	}

}
