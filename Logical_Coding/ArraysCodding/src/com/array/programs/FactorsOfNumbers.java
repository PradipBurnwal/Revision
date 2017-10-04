package com.array.programs;

public class FactorsOfNumbers {

	public static void main(String[] args) {
		//find Factors of a Number from 1 to 100
		for(int i=1; i<=100;i++){
			System.out.println("Factors of a Number"+i+" are: ");
			for(int j=1;j<=i;j++){
				if(i%j==0){
					System.out.println(j);
				}
			}
		}
	}

}
