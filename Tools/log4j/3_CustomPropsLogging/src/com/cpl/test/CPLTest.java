package com.cpl.test;

import org.apache.log4j.PropertyConfigurator;

import com.cpl.dao.PatientDao;

public class CPLTest {

	public static void main(String[] args) {
		PropertyConfigurator.configure(CPLTest.class.getClassLoader().getResource("hms-log4j.properties"));
		PatientDao pdao = new PatientDao();
		pdao.savePatient();
	}

}
