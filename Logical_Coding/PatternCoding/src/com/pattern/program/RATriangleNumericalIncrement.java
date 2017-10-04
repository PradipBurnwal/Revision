package com.pattern.program;

import javax.swing.text.StyledEditorKit.ForegroundAction;
/**
 * 	1
 *	23
 *	456
 *	78910
 **/
public class RATriangleNumericalIncrement {

	public static void main(String[] args) {
		int size = 5;
		int number = 1;
		for (int i = 1; i < size; i++) {
			for(int j=1; j<=i; j++){
				System.out.print(number);
				number = number+1;
			}
			System.out.println();
			
		}
	}

}
