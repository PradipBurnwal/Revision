package com.bi.beans;

public class Car {
	private int id;
	private String model;
	private String manufacturer;
	private String colour;
	private String fuelType;
	private float price;
	public void setId(int id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufacturer="
				+ manufacturer + ", colour=" + colour + ", fuelType="
				+ fuelType + ", price=" + price + "]";
	}
	

}
