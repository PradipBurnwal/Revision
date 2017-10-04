package com.cpc.dto;

public class Address {
	private String streetAddress;
	private String city;
	private int zipCode;
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
}
