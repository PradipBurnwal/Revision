package com.ba.beans;

public class Humpty {
	
	private Dumpty dumpty;

	public void setDumpty(Dumpty dumpty) {
		this.dumpty = dumpty;
	}

	public Humpty() {
		super();
	}

	public Humpty(Dumpty dumpty) {
		System.out.println("Constructor");
		this.dumpty = dumpty;
	}


	public void showHumpty(){
		System.out.println("I am working with Dumpty : "+dumpty.getName());
	}

	@Override
	public String toString() {
		return "Humpty [dumpty=" + dumpty + "]";
	}
	
	
}
