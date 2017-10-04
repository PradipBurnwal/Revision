package com.usingInterface.resource;

public class DoctorImpl implements Doctor {
	//http://localhost:8082/3_WorkingWithInterface/rest/doctor?doctorName=P.Burnwal
	@Override
	public String getContactDetail(String doctorName) {
		return "Doctor Name: "+doctorName+" Mobile no : 9748055422";
	}

}
