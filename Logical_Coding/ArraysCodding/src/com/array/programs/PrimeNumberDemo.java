package com.array.programs;

import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		boolean prime = true;
		System.out.println("Enter any Number to check Prime Number or not?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=2; i<num; i++){
			if(num%i == 0){
				prime = false;
			}
		}
		if(prime == true){
			System.out.println(num+" is a prime Number");
		}else{
			System.out.println(num+" is not a prime Number");
		}
	}

}
