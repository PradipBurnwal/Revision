package com.ai.beans;

public class YamahaEngineImpl implements IEngine {

	@Override
	public int start() {
		System.out.println("Yamaha Engine started..");
		return 1;
	}

}
