package com.array.programs;

import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the Array");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		int i;
		System.out.println("Please Enter the Element: ");
		for(i=0; i<size; i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting");
		for(int x : a){
			System.out.println(x);
		}
		bubbleSort(a);
		System.out.println("After Sorting");
		for(int x : a){
			System.out.println(x);
		}
	}

	private static void bubbleSort(int[] a) {
		int temp = 0;
		for(int i=0; i<a.length; i++){  //No of Element
			for(int j=1; j<(a.length); j++){	//No of Passes
				//Ascending Order sorting
				if(a[j-1]>a[j]){
					//Swap the Element
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

}
