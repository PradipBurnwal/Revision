package com.idref.beans;

public class YahamaEngineImpl implements IEngine {

	@Override
	public int start() {
		System.out.println("Starting Yahama Engine");
		return 1;
	}

}
