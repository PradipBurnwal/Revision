package com.itc.log4j;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		Addition addition = new Addition();
		int res = addition.add(val1, val2);
		System.out.println(res);
		
	}

}