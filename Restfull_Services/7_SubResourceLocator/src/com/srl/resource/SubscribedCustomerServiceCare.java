package com.srl.resource;

import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

public class SubscribedCustomerServiceCare {
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String active4G(@QueryParam("mobile")String mobile){
		return "activated 4G on-"+mobile;
	}
}
