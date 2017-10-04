package com.mp.beans;

import javax.ws.rs.CookieParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class Criteria {
	@PathParam("manuf")
	private String manufacturer;
	@PathParam("model")
	private String model;
	@QueryParam("type")
	private String typr;
	@QueryParam("year")
	private int year;
	@CookieParam("city")
	private String city;
	@QueryParam("color")
	private String color;
	@QueryParam("fuelType")
	private String fuelType;
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTypr() {
		return typr;
	}
	public void setTypr(String typr) {
		this.typr = typr;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Criteria [manufacturer=" + manufacturer + ", model=" + model + ", typr=" + typr + ", year=" + year
				+ ", city=" + city + ", color=" + color + ", fuelType=" + fuelType + "]";
	}
	
	
}
