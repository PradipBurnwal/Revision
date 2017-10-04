package com.itc.langPack;

public class Student {
	int sid;
	long phone;
	public Student(int sid, long phone) {
		this.sid = sid;
		this.phone = phone;
	}
	
	// for lab002Hashcode see in 2nd run
	/*public int hashCode(){
		return (int) (phone | sid);
	}*/
	
	//For lab005toString how to read object contained
	/*@Override
	public String toString() {
		return "Student [sid=" + sid + ", phone=" + phone + "]";
	}*/
	
	

}
