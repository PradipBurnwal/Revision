package com.array.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter Any Words :");
		//Allow to Enter String in console
		Scanner sc = new Scanner(System.in);
		//Reading String From the Console
		String origanal = sc.nextLine();
		String reverse = "";
		//Reversing the orignal String
		for(int i=(origanal.length())-1;i>=0;i--){
			reverse =reverse + origanal.charAt(i);
		}
		//Check Original String and Reverse String are same or not then provides some output
		if(origanal.equals(reverse)){
			System.out.println("Given String is Palindtome");
		}else{
			System.out.println("Given String is not a Palindrome");
		}
	}

}
