package com.itcindia.dto;

public class Account {
	protected String accountNo;
	protected String accountHolderName;
	protected String accountStatus;
	
	public Account(String accountNo, String accountHolderName,String accountStatus) {
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountStatus = accountStatus;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Account other = (Account) obj;
		if(accountNo==null){
			if(other.accountNo!=null)
				return false;
		}else if (!accountNo.equals(other.accountNo)) {
			return false;
		}
		if(accountHolderName==null){
			if(other.accountHolderName!=null)
				return false;
		}else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if(accountStatus==null){
			if(other.accountStatus!=null)
				return false;
		}else if (!accountStatus.equals(other.accountStatus))
			return false;
		return true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime*result+((accountNo==null)?0:accountNo.hashCode());
		result = prime*result+((accountHolderName==null)?0:accountHolderName.hashCode());
		result = prime*result+((accountStatus==null)?0:accountStatus.hashCode());
		return result;
	}
	

}