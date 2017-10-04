package com.docm.util;

import java.io.IOException;
import java.util.Properties;

public class CacheManager {

	public CacheManager() {
		initialize();
	}

	private Object initialize() {
		Cache cache = null;
		cache = Cache.getInstance();
		//read the data and populate into Cache
		Properties props = null;
		props = new Properties();
		try {
			props.load(this.getClass().getClassLoader().getResourceAsStream("city-ri.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
}
