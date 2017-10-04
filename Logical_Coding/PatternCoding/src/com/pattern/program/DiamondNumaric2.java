package com.pattern.program;

public class DiamondNumaric2 {

	public static void main(String[] args) {
		int noOfColoums =1;
		int start = 0;
		for(int i=1; i<=7; i++){
			if(i<4){
				start=i;
			}else {
				start=8-i;
			}
			for(int j=1;j<=noOfColoums;j++){
				int middleColumn = noOfColoums/2+1;
				System.out.print(start);
				if(j<middleColumn){
					start--;
				}else {
					start++;
				}
			}
			System.out.println();
			if(i<4){
				noOfColoums = noOfColoums+2;
			}else{
				noOfColoums = noOfColoums-2;
			}
		}
	}

}
