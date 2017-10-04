package com.itcindia.timeout;

public class BookInfo {
	public float getBookPrice(String isbn) throws InterruptedException{
		if(isbn.equals("isbn1001")){
			Thread.sleep(100L);
			return 303;
		}
		return 35.34f;
	}

}
