package com.doc.util;

import java.util.Map;

public class Cache {
	private static Cache instance;
	
	public static Cache getInstance(){
		if(instance==null){
			instance = new Cache();
		}
		return instance;
	}
	
	private Map<String, Object> dataMap;
	
	public void put(String key, Object val){
		dataMap.put(key, val);
	}
	
	public void get(String key){
		dataMap.get(key);
	}
	public boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
	
}