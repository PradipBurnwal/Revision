package com.pattern.program;

import java.util.Scanner;

public class RightAngleTrinagleL2R {
/**
 * 		*
 * 		* *
 * 		* * *
 * 
 * @param args
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++){
			for(int j=1; j<=size; j++){
				if(j<=i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
	}

}
