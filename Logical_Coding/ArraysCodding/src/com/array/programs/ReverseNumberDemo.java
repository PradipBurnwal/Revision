package com.array.programs;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		Integer number = 123;
		String numberString = String.valueOf(number);
		String reverse = "";
		for(int i=numberString.length()-1; i>=0; i--){
			reverse = reverse + numberString.charAt(i);
		}
		System.out.println(Integer.valueOf(reverse));
	}

}
