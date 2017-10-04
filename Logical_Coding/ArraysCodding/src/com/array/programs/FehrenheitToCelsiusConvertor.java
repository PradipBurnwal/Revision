package com.array.programs;

import java.util.Scanner;

public class FehrenheitToCelsiusConvertor {

	public static void main(String[] args) {
		float temp;
		System.out.println("Enter the temp in Fehrenheit to converte into Celsius :");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextFloat();
		temp = ((temp-32)*5)/9;
		System.out.println("Temperature in Celsius : "+temp);
	}

}
