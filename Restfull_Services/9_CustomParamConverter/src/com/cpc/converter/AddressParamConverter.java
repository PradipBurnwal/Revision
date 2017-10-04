package com.cpc.converter;

import javax.ws.rs.ext.ParamConverter;

import com.cpc.dto.Address;

public class AddressParamConverter implements ParamConverter<Address>{

	@Override
	public Address fromString(String param) {
		String[] splits = null;
		Address address = null;
		
		address = new Address();
		if(param!=null && param.trim().length()>0){
			splits = param.split(",");
			if(splits.length==3){
				address.setStreetAddress(splits[0]);
				address.setCity(splits[1]);
				address.setZipCode(Integer.parseInt(splits[2]));
			}else if (splits.length==2) {
				address.setCity(splits[0]);
				address.setZipCode(Integer.parseInt(splits[1]));
			}else if (splits.length==1) {
				address.setZipCode(Integer.parseInt(splits[0]));
			}
		}
		return address;
	}

	@Override
	public String toString(Address address) {
		return address.getStreetAddress()+","+address.getCity()+","+address.getZipCode();
	}

}
