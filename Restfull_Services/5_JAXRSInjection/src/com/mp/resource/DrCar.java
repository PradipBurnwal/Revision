package com.mp.resource;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.CookieParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

import com.mp.beans.Criteria;


@Path("/drCar")
public class DrCar {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{type}/{manuf}/{year}")
	public String search(@PathParam("type")String type, @PathParam("manuf")String manufacture,@PathParam("year")int year,
			@MatrixParam("color")String color,@MatrixParam("fuelType")String fuelType,
			@CookieParam("city")String city){
		return "Type: "+type+" Manufacture_by-"+manufacture+" Year-"+year+
				" Color-"+color+" Fuel_Type-"+fuelType+" City-"+city;
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/SUV;color=Red;fuelType=Petrol/Hundai/2015
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/enquire/{name}/{mobile}")
	public String enquire(@PathParam("name")String name,@PathParam("mobile")String mobile,
			@DefaultValue("Not Available")@QueryParam("email")String email){
		return "Name-"+name+" Mobile-"+mobile+" email:"+email;
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/enquire/pradip/8569532
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/enquire/pradip/8569532?email=pradip.burnwal@gmail.com
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/quote/{model}/{manuf}/{year}")
	public String getQuote(@PathParam("model")PathSegment modelPathSeg,@PathParam("manuf")PathSegment manufPathSeg,@PathParam("year")int year){
		String modelColor = modelPathSeg.getMatrixParameters().getFirst("color");
		String manufColor = manufPathSeg.getMatrixParameters().getFirst("color");
		
		return "model:"+modelPathSeg.getPath()+ "color:"+modelColor+" manuf:"
		+manufPathSeg.getPath()+" color"+manufColor+" Year"+year;
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/quote/Hashback;color=Red/Maecidies;color=Blue/2000
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sales/{model}/{type}")
	/*http://localhost:8082/4_JAXRSInjection/rest/drCar/sales/honda;color=red;color=blue/tvf
*/	public String saleReporty(@PathParam("model")PathSegment model,@PathParam("type")PathSegment type){
		StringBuffer buffer = new StringBuffer();
		buffer.append("path:"+model.getPath());
		buffer.append(extract(model.getMatrixParameters()));
		buffer.append("path:"+type.getPath());
		buffer.append(extract(type.getMatrixParameters()));
		return buffer.toString();
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/sales/hashback;size=big;Duration=5yrOld/honda;color=Yellow
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/addCar")
	public String addCar(@FormParam("modelNo")String modelNo,@FormParam("type")String type,
			@FormParam("manuf")String manufacturer,@FormParam("year")int year){
		return "Model no-"+modelNo+" Type-"+type+" Manuf-"+manufacturer+" Year-"+year;
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/addCar
		//write contain in body x-www-form-url(key and value)
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/buy")
	public String buyReport(@HeaderParam("agentNo")String agentNo,@FormParam("model")String model,@FormParam("type")String type){
		return "Agent No -"+agentNo+" Model-"+model+" Type:"+type;
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/buy
		//write header(key and value) and body x-www-form(key and value)
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/clientId")
	public String getClientId(@HeaderParam("username")String username){
		return "header-"+username;
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/clientId
		//write header(key & value)
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/cookie")
	public Response createCityCookie(){
		NewCookie cookie = new NewCookie("city", "Bangalore");
		return Response.ok().cookie(cookie).build();
		//http://localhost:8082/4_JAXRSInjection/rest/drCar/cookie
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/searchCar/{manuf}/{model}")
	public String search(@BeanParam Criteria criteria){
		return criteria.toString();
		////http://localhost:8082/4_JAXRSInjection/rest/drCar/searchCar/honda/i10?type=SUV&year=2010&color=Red&fuelType=Petrol
	}
	
	private String extract(MultivaluedMap<String, String> matrixParameters) {
		StringBuffer buffer = new StringBuffer();
		
		for(String paramName:matrixParameters.keySet()){
			buffer.append(paramName).append(":");
			List<String> values = matrixParameters.get(paramName);
			for(String value: values){
				buffer.append(value+" ");
			}
			buffer.append(";");
		}
		return buffer.toString();
	}
}
