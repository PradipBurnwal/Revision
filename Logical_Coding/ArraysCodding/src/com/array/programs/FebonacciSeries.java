package com.array.programs;

public class FebonacciSeries {
	//each number is the sum of previous two number
	public static void main(String[] args) {
		int count =15;
		//declear one array with length of the Series
		int[] fib = new int[count];
		fib[0] = 0;
		fib[1] = 1;
		//Fibonacci Series
		for(int i=2; i<count; i++){
			//logic for Fibonacci
			fib[i] = fib[i-1] + fib[i-2];
		}
		//Display the Fibonacci Series
		for (int i : fib) {
			System.out.print(i+" ");
		}
		
	}

}
