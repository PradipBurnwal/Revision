package com.array.programs;

import java.util.Scanner;

public class LargestDemoUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3disting number :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x>y && x>z){
			System.out.println(x+" is the Largest Number");
		}else if (y>z && y>x) {
			System.out.println(y+" is the Largest Number");
		}else if (z>x && z>y) {
			System.out.println(z+" is the Largest Number");
		}else {
			System.out.println("More then one number are Greater Number");
		}
	}

}
