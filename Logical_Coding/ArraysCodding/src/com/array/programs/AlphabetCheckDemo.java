package com.array.programs;

import java.util.Scanner;

public class AlphabetCheckDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
			System.out.println("The given character is Alphabet");
		}else{
			System.out.println("The given character is not Alphabet");
		}
	}

}
