package com.aptc.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.aptc.dto.SearchCriteria;

@Path("/address")
public class AddressResource {
	@GET
	@Path("/zip/{zip}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAreaCode(@PathParam("zip")int zip){
		return "zip-"+zip;
	//http://localhost:8082/8_AutomaticParamTypeConverter/rest/address/zip/713346
	}
	
	@GET
	@Path("/area/{areaCode}")
	@Produces(MediaType.TEXT_PLAIN)
	public String findZipCode(@PathParam("areaCode")SearchCriteria criteria){
		return "zip for areaCode:"+criteria.getAreaCode();
	//http://localhost:8082/8_AutomaticParamTypeConverter/rest/address/area/713346
	}
	
	@GET
	@Path("/blackList")
	@Produces(MediaType.TEXT_PLAIN)
	public String addToBlackList(@QueryParam("zip")List<Integer> zipCodes){
		StringBuffer buffer = null;
		
		buffer = new StringBuffer();
		buffer.append("BlackListed ZipCode are-");
		for(int z:zipCodes){
			buffer.append(z).append(",");
		}
		return buffer.toString();
	//http://localhost:8082/8_AutomaticParamTypeConverter/rest/address/blackList?zip=713345&zip=563214&zip=569852
	}
}
