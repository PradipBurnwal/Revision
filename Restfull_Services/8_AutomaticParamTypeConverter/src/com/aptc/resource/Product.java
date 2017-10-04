package com.aptc.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.aptc.dto.Criteria;

@Path("/product")
public class Product {
	@GET
	@Path("/search")
	@Produces(MediaType.TEXT_PLAIN)
	public String search(@QueryParam("keyword")Criteria criteria){
		return criteria.toString();
	}
}
