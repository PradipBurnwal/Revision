package com.ifmi.ext.beans;

public class BseStockManagerImpl implements StockManager {

	@Override
	public double getStockPrice(String stockName) {
		double price = 0;
		
		if(stockName!=null && stockName.trim().length()>0){
			if(stockName.equalsIgnoreCase("cipla")){
				price =356.05;
			} else if (stockName.equalsIgnoreCase("ranbaxy")) {
				price = 120.53;
			}else {
				price = 100;
			}
		}
		return price;
	}

}
