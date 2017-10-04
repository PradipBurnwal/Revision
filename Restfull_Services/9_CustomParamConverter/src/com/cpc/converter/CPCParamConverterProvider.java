package com.cpc.converter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

import com.cpc.dto.Address;

@Provider
public class CPCParamConverterProvider implements ParamConverterProvider{

	@Override
	public ParamConverter getConverter(Class classType, Type rawType, Annotation[] annotation) {
		if(classType.isAssignableFrom(Address.class)){
			return new AddressParamConverter();
		}
		return null;
	}

}
