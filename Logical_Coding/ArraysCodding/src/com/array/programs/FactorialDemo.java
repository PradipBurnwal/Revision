package com.array.programs;

public class FactorialDemo {
	//factorial(4)= 1*2*3*4 = 24 
	public static void main(String[] args) {
		int number = 5;
		int fact = 1;
		for(int i=1; i<=number;i++){
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
