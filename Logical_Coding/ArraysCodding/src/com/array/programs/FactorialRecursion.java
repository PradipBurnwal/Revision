package com.array.programs;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		System.out.println("For which number you want the Factorial ?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}

	private static int factorial(int number) {
		if(number==0){
			return 1;
		}
		return number*factorial(number-1);
	}

}
