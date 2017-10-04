package com.jcaa6.test;

public class ControlBoard {
	private Machine machine;

	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public void powerOn(){
		machine.run();
	}

	public Machine getMachine() {
		return machine;
	}
	
}
