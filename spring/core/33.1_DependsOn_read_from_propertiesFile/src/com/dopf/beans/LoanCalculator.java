package com.dopf.beans;

import java.io.IOException;
import java.util.Properties;

public class LoanCalculator {
	public double calInt(Long principle, int n, String city) throws IOException{
		float ri = 0.0f;
		double intAmt = 0.0f;
		Properties cityIntProps = null;
		
		//read the data from properties file
		cityIntProps = new Properties();
		
		//load into properties collection
		cityIntProps.load(this.getClass().getClassLoader().getResourceAsStream("cityIntRates.properties"));
		
		//now find the rate of interest for the given city
		ri =  Float.valueOf((String) cityIntProps.get(city));
		
		//logic for calculating interest to be paid
		intAmt = (principle*n*ri)/100;
		return intAmt;
	}
}
