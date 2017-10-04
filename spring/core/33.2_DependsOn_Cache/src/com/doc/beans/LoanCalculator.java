package com.doc.beans;

import java.util.Properties;

import com.doc.util.Cache;

public class LoanCalculator {
	public double calInt(long principle, int n, String city){
		float ri = 0.0f;
		float intAmt = 0.0f;
		Cache cache = null;
		Properties cityIntProps = null;
		
		cache = Cache.getInstance();
		if(cache.containsKey("cityRI")==false){
			//read the data from properties file
			cityIntProps = new Properties();
			//make it as properties collection
			cityIntProps.load(this.getClass().getClassLoader().getResourceAsStream("cityIntRates.properties"));
			
			//store in Cache with key as "cityRI"
			cache.put("cityRI", cityIntProps.get(city));
			
		}
		cityIntProps = cache.get("cityRI");
		ri = Float.parseFloat(cityIntProps.getProperty(city));
		intAmt =(principle*n*ri)/100;
		return intAmt;
	}

}