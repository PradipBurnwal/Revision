package com.itc.langPack;

public class Employee {
	int eid;
	String ename;
	
	public Employee(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee){
			Employee emp = (Employee) obj;
			return this.eid==emp.eid && this.ename.equals(emp.ename);
		}
		return false;
	}*/
	
	
	
}
