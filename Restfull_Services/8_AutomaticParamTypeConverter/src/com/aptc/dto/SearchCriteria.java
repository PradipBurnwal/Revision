package com.aptc.dto;

public class SearchCriteria {
	public String areaCode;

	public SearchCriteria(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	
	public String valueOf(SearchCriteria criteria){
		return String.valueOf(areaCode);
	}

}
