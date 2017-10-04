package com.pattern.program;

import java.util.Scanner;

public class PyramitNumarical {
/**
 * 	    1
 * 	   2 2
 *	  3 3 3
 *	 4 4 4 4
 *	5 5 5 5 5
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Size :");
		int size = sc.nextInt();
		int noOfSpaces = size-1;
		for (int i = 1; i <=size; i++) {
			for(int j=1; j<=noOfSpaces;j++){
				System.out.print(" ");
			}
			noOfSpaces = noOfSpaces-1;
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		
	}

}
