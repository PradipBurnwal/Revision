package com.fra.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/bank")
public class BankResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getBalance(@QueryParam("accNo")String accountNo){
		return "Account Balance for Account No-"+accountNo+" is 100000.";
	}
	
	@POST
	@Produces({"text/plain","application/xml","application/json"})
	@Consumes({"text/plain","application/xml","application/json"})
	public int createAccount(String personName){
		return (int) (Math.random()*10+1);
	}
}
