package com.array.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		Map<String, String> unSortedMap = new HashMap<>();
		unSortedMap.put("apple", "Apple");
		unSortedMap.put("mango", "Mango");
		unSortedMap.put("chiku", "Chiku");
		unSortedMap.put("pineApple", "PineApple");
		
		//Displaying the key from each Entry of unSortedMap
		for(Map.Entry<String, String> entry : unSortedMap.entrySet()){
			System.out.println("UnSortedMap Key-Value :"+entry.getKey());
		}
		
		//Converting the unSortedMap into TreeMap so that the unSortedMap get sorted in DNSO 
		Map<String, String> treeMap = new TreeMap<String, String>(unSortedMap);

		//Displaying the key from each Entry of  TreeMap
		for(Map.Entry<String, String> entry : treeMap.entrySet()){
			System.out.println("TreeMap Key-Value :"+entry.getKey()+" : "+entry.getValue());
		}
		
	}
	
	
		
}
