package com.ji.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/icici")
public class BankResource {
	@GET
	@Path("/account/{accNo:\\d{3}}-{accType}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAccountInfo(@PathParam("accNo")int accountNo, @PathParam("accType")String accountType){
		return "Account No-"+accountNo+" Account Type-"+accountType+" Account holder's Name : Pradip";
	//http://localhost:8082/4_JAXRSInjection/rest/icici/account/123-saving
	}
	
	@GET
	@Path("/{accNo}/balance")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBalance(@PathParam("accNo")int accountNo){
		return "Account No "+accountNo+" has a balance of Rs.2000000";
		//http://localhost:8082/4_JAXRSInjection/rest/icici/123/balance
	}
}
