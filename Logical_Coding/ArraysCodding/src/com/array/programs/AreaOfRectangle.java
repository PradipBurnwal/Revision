package com.array.programs;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Length : ");
		int len = sc.nextInt();
		System.out.println("Please Enter the Breadth");
		int bre = sc.nextInt();
		int area = len*bre;
		System.out.println("Area : "+area);
	}

}
