package com.srl.resource;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

public class TechnicalSupportAssistance {
	@POST
	@Path("/call-issue")
	@Produces(MediaType.TEXT_PLAIN)
	public String reportCallIssue(@QueryParam("mobile")String mobile){
		return "complain register with no: 365214 for mobile:"+mobile;
	}
}
