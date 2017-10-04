package com.array.programs;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] values= {8,6,15,25,5,34};
		int smallest = values[0];
		for(int i=1;i<values.length;i++){
			if(values[i]<smallest){
				smallest=values[i];
			}
		}
		System.out.println(smallest);
	}

}
