package com.array.programs;

import java.util.Arrays;

public class SortStringDemo {

	public static void main(String[] args) {
		String str = "pradip";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String sortedStr = new String(ch);
		System.out.println(sortedStr);
	}

}
