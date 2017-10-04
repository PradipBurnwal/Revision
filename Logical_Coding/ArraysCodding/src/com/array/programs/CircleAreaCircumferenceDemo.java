package com.array.programs;

import java.util.Scanner;

public class CircleAreaCircumferenceDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Radius of the Circle: ");
		double r = sc.nextInt();
		
		double area = Math.PI*(r*r);
		System.out.println("Area of Circle : "+area);
		
		double circum = 2*Math.PI*r;
		System.out.println("Circumference : "+circum);
	}

}
