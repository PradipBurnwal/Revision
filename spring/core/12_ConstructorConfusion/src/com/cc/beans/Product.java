package com.cc.beans;

public class Product {
	private int id;
	private String productName;
	private Double price;
	
	public Product(int id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
	}

	public Product(String productName, Double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName
				+ ", price=" + price + "]";
	}
	
}
