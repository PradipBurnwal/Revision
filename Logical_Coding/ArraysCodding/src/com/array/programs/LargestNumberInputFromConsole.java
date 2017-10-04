package com.array.programs;

import java.util.Scanner;

public class LargestNumberInputFromConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please Enter the Size of the Array: ");
		//It will read the input from the console
		int sz= sc.nextInt();
		//Now we declaring the no. of arrays which we required
		int []a = new int[sz];
		
		System.out.println("Please Enter the Elements");
		for(int i=0; i<sz; i++){
			a[i] = sc.nextInt();
		}
		
		int largest = a[0];
		for(int i=1; i<sz; i++){
			if(a[i]>largest){  //for smallest just change ">" signto "<" & var name
				largest = a[i];
			}
		}
		System.out.println(largest);
		
	}
	
	

}
