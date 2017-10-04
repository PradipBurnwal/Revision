package com.bi.beans;

import java.beans.ConstructorProperties;

public class Bus {
	private int id;
	private String model;
	private String manufacturer;
	private String colour;
	private String fuelType;
	private float pricr;
	
	@ConstructorProperties({"id","model","manufacturer","color","fuelType","price"})
	public Bus(int id, String model, String manufacturer, String colour,
			String fuelType, float pricr) {
		this.id = id;
		this.model = model;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.fuelType = fuelType;
		this.pricr = pricr;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufacturer="
				+ manufacturer + ", colour=" + colour + ", fuelType="
				+ fuelType + ", pricr=" + pricr + "]";
	}
	
	
}
