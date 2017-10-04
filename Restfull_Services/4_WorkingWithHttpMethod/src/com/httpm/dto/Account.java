package com.httpm.dto;

import java.io.Serializable;

public class Account implements Serializable{
	private String accountNo;
	private String mobile;
	private String memberName;
	private String emailAddress;
	private String password;
	private float balnce;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public float getBalnce() {
		return balnce;
	}
	public void setBalnce(float balnce) {
		this.balnce = balnce;
	}
	
}
