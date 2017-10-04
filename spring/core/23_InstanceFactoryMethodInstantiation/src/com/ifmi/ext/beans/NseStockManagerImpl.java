package com.ifmi.ext.beans;


public class NseStockManagerImpl implements StockManager {

	@Override
	public double getStockPrice(String stockName) {
		double price = 0;
		
		if(stockName!=null && stockName.trim().length()>0){
			if(stockName.equalsIgnoreCase("cipla")){
				price =1356.05;
			} else if (stockName.equalsIgnoreCase("ranbaxy")) {
				price = 1001;
			}else {
				price = 1000;
			}
		}
		return price;
	}

}
