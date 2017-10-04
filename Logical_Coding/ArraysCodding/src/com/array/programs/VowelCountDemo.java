package com.array.programs;

import java.util.Scanner;

public class VowelCountDemo {

	public static void main(String[] args) {
		System.out.println("Enter any Words :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char chars[] = str.toCharArray();
		
		int count = 0;
		for (char c : chars) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("number of Vowels in String :"+count);
	}

}
