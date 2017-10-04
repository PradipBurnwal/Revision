package com.ifmi.beans;

import com.ifmi.ext.beans.StockManager;
import com.ifmi.ext.beans.BseStockManagerImpl;
import com.ifmi.ext.beans.NseStockManagerImpl;

public class StockTradeServiceLocator {
	private String type;
	public StockManager locateStockManager(){
		// jndi lookup to retrieve the stock manager object
		if(type.equals("bsc")){
			return new BseStockManagerImpl();// in actual application the impl class
		// will not be available
		}else if(type.equals("nsc")){
			return new NseStockManagerImpl();
		}
		return null;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
