package com.uns.beans;

public class Toy {
	private Remote remote;

	public Toy(Remote remote) {
		super();
		this.remote = remote;
	}

	@Override
	public String toString() {
		return "Toy [remote=" + remote + "]";
	}
	

}
