package com.array.programs;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping a= "+a);
		System.out.println("Before Swapping b= "+b);
		swap(a,b);
	}

	private static void swap(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a= "+a);
		System.out.println("After Swapping b= "+b); 
	}

}
