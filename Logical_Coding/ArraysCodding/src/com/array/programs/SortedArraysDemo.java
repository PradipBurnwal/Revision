package com.array.programs;

import java.util.Arrays;
import java.util.Collections;

public class SortedArraysDemo {

	public static void main(String[] args) {
		String str[] = {"one","two","three","four"};

		System.out.println("***Before Sorting***");
		for(String s : str){
			System.out.print(s+", ");
		}
		//sorting logic for Asce order
		Arrays.sort(str);
		
		System.out.println();
		System.out.println("***After Sorting***");
		for(String s : str){
			System.out.print(s+", ");
		}
		//sort in desc order
		Arrays.sort(str,Collections.reverseOrder());
		System.out.println();
		System.out.println("***Sorting order in DECENDING order***");
		for(String s : str){
			System.out.print(s+", ");
		}
	}

}
