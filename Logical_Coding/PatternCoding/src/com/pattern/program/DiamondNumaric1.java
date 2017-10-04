package com.pattern.program;

public class DiamondNumaric1 {

	public static void main(String[] args) {
		int noOfColoum =1;
		for(int i=1;i<=7;i++){
			for(int j=1; j<=noOfColoum; j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<4){
				noOfColoum=noOfColoum+2;
			}else{
				noOfColoum=noOfColoum-2;
			}
			
		}
		
	}

}
