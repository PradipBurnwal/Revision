package com.pattern.program;

import java.util.Scanner;

public class DiamondNumaric3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Size of the Diamond :");
		int size =sc.nextInt();
		int noOfColoums = 1;
		int start = 0;
		int noOfSpaces =size/2;
		for (int i = 1; i <= size; i++) {
			
			for(int j=1; j<=noOfSpaces; j++){
				System.out.print(" ");
			}
			if(i<size/2+1){
				start = i;
				noOfSpaces = noOfSpaces-1;
			}else {
				start =(size+1)-i;
				noOfSpaces = noOfSpaces+1;
			}
			
			for (int j = 1; j <= noOfColoums; j++) {
				int middleColoums = noOfColoums/2+1;
				System.out.print(start);
				if(j<middleColoums){
					start--;
				}else {
					start++;
				}
			}
			System.out.println();
			if(i<size/2+1){
				noOfColoums = noOfColoums+2;
			}else {
				noOfColoums = noOfColoums-2;
			}
		}
	}

}
