package com.idref.beans;

public class SuzkiEngineImpl implements IEngine {

	@Override
	public int start() {
		System.out.println("Starting Suzki Engine");
		return 1;
	}

}
