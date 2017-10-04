package com.pattern.program;

import java.util.Scanner;

public class RightAngleTriangleL2RReverse {
/**
 * 		* * *
 * 		* *
 * 		*
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		for(int i=1; i<=size; i++){
			for(int j=size; j>=1; j--){
				if(j>=i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
