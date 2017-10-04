package com.resource.test;

import javax.annotation.Resource;
import javax.inject.Named;
@Named
public class Robot {
	@Resource
	private Sensor sensor;

	@Override
	public String toString() {
		return "Robot [sensor=" + sensor + "]";
	}
	

}
