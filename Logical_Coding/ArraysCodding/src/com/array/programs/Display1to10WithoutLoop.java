package com.array.programs;

public class Display1to10WithoutLoop {

	public static void main(String[] args) {
		printNumber(1);
	}

	private static void printNumber(int n) {
		if(n<=10){
			System.out.print(n+", ");
			printNumber(n+1);
		}
	}

}
