package com.ifmi.ext.beans;

public class NseStockManagerImpl implements StockManager {

	@Override
	public double getStockPrice(String stockName) {
		double price = 0;
		if(stockName!=null && stockName.trim().length()>0){
			if(stockName.equals("ITC")){
				price=500.59;
			}else if (stockName.equals("TCS")) {
				price = 750.85;
			}else {
				try {
					throw new Exception("Stock Not Found, enter valid Stock Name");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return price;
		
	}

}
