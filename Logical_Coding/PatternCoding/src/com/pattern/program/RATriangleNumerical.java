package com.pattern.program;

public class RATriangleNumerical {
/**
 * 	1
 *	12
 *	123
 *	1234
 *	12345
 * 
 * @param args
 */
	public static void main(String[] args) {
		int size =5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
