package com.array.programs;

public class LargestNumber {

	public static void main(String[] args) {
		int[] values={85,98,25,35,46};
		int largest = values[0];
		for(int i=1;i<values.length; i++){
			if(values[i]>largest){
				largest = values[i];
			}
		}
		System.out.println(largest);
	}

}
