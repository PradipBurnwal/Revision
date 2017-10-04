package com.ifmi.beans;

import com.ifmi.ext.beans.NseStockManagerImpl;
import com.ifmi.ext.beans.StockManager;

public class StokManagerServiceLocator {
	
	public StockManager locateStockManager(){
		
		return new NseStockManagerImpl();
	}
	

}
