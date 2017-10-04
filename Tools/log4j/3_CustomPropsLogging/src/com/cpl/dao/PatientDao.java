package com.cpl.dao;

import org.apache.log4j.Logger;

public class PatientDao {
	private final static Logger logger = Logger.getLogger(PatientDao.class);
	
	public void savePatient(){
		logger.debug("...Entered_into_save_Patient...");
		logger.info("..Patient_Save..");
		logger.error("..Patient_Died..");
	}
}
