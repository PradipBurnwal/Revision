package com.array.programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String:");
		String str1 = scanner.nextLine();
		System.out.println("Enter Second String:");
		String str2 = scanner.nextLine();
		System.out.println("Both string are Anagrams : "+anagramCheck(str1, str2));
	}
	public static boolean anagramCheck(String str1, String str2){
		char[] charArrayFromString1 = str1.toCharArray();
		char[] charArrayFromString2 = str2.toCharArray();
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
		return Arrays.equals(charArrayFromString1, charArrayFromString2);
	}

}
