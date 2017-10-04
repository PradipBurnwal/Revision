package com.cpc.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cpc.dto.Address;

@Path("/amazon")
public class Amazon {
	@GET
	@Path("/pickup")
	@Produces(MediaType.TEXT_PLAIN)
	public String pickup(@QueryParam("address")Address address){
		return address.toString();
	}
}
