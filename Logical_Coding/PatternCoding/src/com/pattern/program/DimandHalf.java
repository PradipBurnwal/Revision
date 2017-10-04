package com.pattern.program;

import java.util.Scanner;

public class DimandHalf {

	public static void main(String[] args) {
		
		int odd=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=odd;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<4){
				odd=odd+2;
			}else {
				odd=odd-2;
			}
			
		}
		
	}

}
