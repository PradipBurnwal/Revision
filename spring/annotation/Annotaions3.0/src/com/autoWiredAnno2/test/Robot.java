package com.autoWiredAnno2.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Robot {
	private Chip chip;
	
	private Senser senser;

	@Autowired
	@Qualifier("chip")
	public void setChip(Chip chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Robot [chip=" + chip + "]";
	}
	

}
