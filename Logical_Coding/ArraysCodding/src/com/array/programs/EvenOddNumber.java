package com.array.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOddNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Any Number");
		Integer number = Integer.parseInt(br.readLine());
		if(number%2==0){
			System.out.println(number+" is an Even Number");
		}else {
			System.out.println(number+" is an Odd Number");
		}
	}

}
