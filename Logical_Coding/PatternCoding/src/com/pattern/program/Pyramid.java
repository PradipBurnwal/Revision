package com.pattern.program;

public class Pyramid {
/**
 * 			    *
 * 			   * *
 * 			  * * *
 * 			 * * * *
 * @param args
 */
	public static void main(String[] args) {
		int size = 5;
		int noOfSpaces = 4;
		for (int i = 1; i <=size; i++) {
			for (int j = 1; j <=noOfSpaces; j++) {
				System.out.print(" ");
			}
			noOfSpaces=noOfSpaces-1;
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
