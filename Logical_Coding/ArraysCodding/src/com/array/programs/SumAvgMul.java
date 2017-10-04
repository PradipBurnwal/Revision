package com.array.programs;

import java.util.Scanner;

public class SumAvgMul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		int sum = 0;
		int mul = 1;
		System.out.println(" ***List of Choice***");
		System.out.println(" 1 _ SUM");
		System.out.println(" 2 _ AVG");
		System.out.println(" 3 _ MULTIPLY");
		System.out.println("Enter Your Choice");
		choice = sc.nextInt();
		
		System.out.println("Enter Number (Seperted with comma) to perform Operation");
		Scanner sc1 = new Scanner(System.in);
		String inputNumber = sc1.nextLine();
		String number[] = inputNumber.split(",");
		
		for(int i=0;i<number.length; i++){
			sum=sum+Integer.parseInt(number[i]);
		}
		switch (choice) {
		case 1: 
			System.out.println("Sum is: "+sum);
			break;
		case 2:
			System.out.println("Avg is: "+sum/number.length);
			break;
		case 3:
			for(String string : number){
				mul = mul*Integer.parseInt(string);
			}
		System.out.println(" Multiplication is: "+mul);
		}
	}

}
