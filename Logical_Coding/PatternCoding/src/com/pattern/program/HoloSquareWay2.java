package com.pattern.program;

import java.io.IOException;
import java.util.Scanner;

public class HoloSquareWay2 {
	/**
	 *     * * * * * 
	 *     *       * 
	 *     *       * 
	 *     * * * * *
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size = sc.nextInt();
		
		for(int i=1; i<=size; i++){
			for(int j=1; j<=size; j++){
				if(i==1 || i==size || j==1 || j==size){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
