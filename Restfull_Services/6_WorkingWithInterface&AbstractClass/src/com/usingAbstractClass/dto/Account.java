package com.usingAbstractClass.dto;

public class Account {
	protected String accountNo;
	protected String mobile;
	protected String accountHolderName;
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
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", mobile=" + mobile + ", accountHolderName=" + accountHolderName
				+ "]";
	}
	

}
