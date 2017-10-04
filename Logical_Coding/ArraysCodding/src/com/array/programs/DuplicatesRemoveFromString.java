package com.array.programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesRemoveFromString {

	public static void main(String[] args) {
		String str = "pradeep";
		System.out.println(removeDuplicates(str));
	}

	private static String removeDuplicates(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer buffer = new StringBuffer();	//Empty StringBuffer
		for(int i=0; i<str.length(); i++){
			Character c = str.charAt(i);			//str.charAt(0) -->p
			if(!set.contains(c)){					//if 'p' is not present in HashSet
				set.add(c);							//add 'p' in the Set
				buffer.append(c);					//append 'p' to StringBuffer
			}
		}
		return buffer.toString();
		
	}

}
