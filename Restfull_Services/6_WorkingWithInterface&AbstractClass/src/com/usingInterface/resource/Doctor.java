package com.usingInterface.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/doctor")
public interface Doctor{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String getContactDetail(@QueryParam("doctorName")String doctorName);
}
