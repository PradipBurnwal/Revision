package com.bindingURI.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/uber")
public class UberRide {
	@GET
	@Path("/estimate")
	@Produces(MediaType.TEXT_PLAIN)
	public float getEstimateCost(@QueryParam("source")
	String source,@QueryParam("dest")String destination){
		return 356.52f;
	}
	@GET
	@Path("/rate")
	@Produces(MediaType.TEXT_PLAIN)
	public float getRatePerKM(@QueryParam("area")String area){
		return 25;
	}
}
