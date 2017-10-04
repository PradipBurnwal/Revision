package com.templetParameter.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product/{item}")
public class ProductResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getProductDetail(@PathParam("item")String productName){
		return "Product Name:"+productName+" manufactured by: Patanjali";
	}
}
