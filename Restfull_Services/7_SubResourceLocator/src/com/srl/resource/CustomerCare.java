package com.srl.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/airtel")
public class CustomerCare {
	@GET
	@Path("/plan-info")
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlanInfo(@QueryParam("planName")String planName){
		return "Calling for-"+planName;
	}
	
	@GET
	@Path("/mobile-data")
	@Produces(MediaType.TEXT_PLAIN)
	public String getDataPlan(@QueryParam("planName")String planName){
		return "data-"+planName;
	}
	
	
	/**
	 * Sub-Resource-Locator
	 * @param type
	 * @return
	 */
	
	/*@Path("/subscribers")
	public SubscribedCustomerServiceCare subscribedCustomers(){
		return new SubscribedCustomerServiceCare();
	}*/
	
	@Path("/{type}")	
	public Object locateServices(@PathParam("type")String type){
		if(type.equals("subscribers")){
			return new SubscribedCustomerServiceCare();
		}else if (type.equals("technical")) {
			return new TechnicalSupportAssistance();
		}
		return null;
	}
}
