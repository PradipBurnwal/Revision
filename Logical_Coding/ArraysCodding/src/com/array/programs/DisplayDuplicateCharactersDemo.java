package com.array.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DisplayDuplicateCharactersDemo {

	public static void main(String[] args) {
		String str = "padeep";
		displayDuplicates(str);
	}

	private static void displayDuplicates(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] characters = str.toCharArray();
		for(char c: characters){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c,map.get(c)+1);
			}
			Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
			for(Map.Entry<Character, Integer> entry : entrySet){
				if(entry.getValue()>1){
					System.out.println(entry.getKey()+" : "+entry.getValue());
				}
			}
		}
	}

}
