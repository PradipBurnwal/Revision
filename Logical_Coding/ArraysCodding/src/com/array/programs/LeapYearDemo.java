package com.array.programs;

import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		System.out.println("Enter any Year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%4==0){
			System.out.println(year+" is a Leap Year");
		}else{
			System.out.println(year+" is not a Leap Year");
		}
	}

}
