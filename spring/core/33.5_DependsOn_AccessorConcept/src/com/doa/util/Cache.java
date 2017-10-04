package com.doa.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.text.StyledEditorKit.BoldAction;


public class Cache {
	private static Cache instance;
	private Map<String, Object> dataMap;
	
	public Cache() {
		this.dataMap = new ConcurrentHashMap<String, Object>();
	}

	public static synchronized Cache getInstance(){
		if(instance== null){
			instance = new Cache();
		}
		return instance;
	}
	
	public void put(String key, Object val){
		this.dataMap.put(key, val);
	}
	public Object get(String key){
		return dataMap.get(key);
	}
	public boolean containsKey(String key){
		return dataMap.containsKey(key);
	}
}
