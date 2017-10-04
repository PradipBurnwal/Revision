package com.fja.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getProductDetails(@QueryParam("proCode")String productCode){
		return "For Product Code-"+productCode+" product Name is AC and price is 25000";
	}
}
