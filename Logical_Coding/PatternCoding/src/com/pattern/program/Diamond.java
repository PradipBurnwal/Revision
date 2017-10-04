package com.pattern.program;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int odd =1;
		int noOfSpaces = size/2;
		for (int i =1; i<=size; i++) {
			for(int j=noOfSpaces; j>=1; j--){
				System.out.print(" ");
			}
			for(int j = 1; j <=odd; j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<size/2+1){
				odd = odd+2;
				noOfSpaces = noOfSpaces-1;
			}else {
				odd = odd-2;
				noOfSpaces=noOfSpaces+1;
			}
		}
	}
}
