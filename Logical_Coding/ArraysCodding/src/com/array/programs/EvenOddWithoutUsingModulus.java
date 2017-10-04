package com.array.programs;

import java.util.Scanner;

public class EvenOddWithoutUsingModulus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number :");
		int number = sc.nextInt();
		int result = (number/2)*2;
		if(result==number){
			System.out.println(number+" is an Even Number");
		}else {
			System.out.println(number+" is an Odd Number");
		}
	}

}
