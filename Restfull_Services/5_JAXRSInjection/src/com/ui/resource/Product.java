package com.ui.resource;

import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;

@Path("/product")
public class Product {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/browse/{category}/{user}")
	public String browse(@Context UriInfo uriInfo,@Context HttpHeaders headers){
		StringBuffer buffer = null;
		List<PathSegment> pathSegments = null;
		MultivaluedMap<String, String> queryParameters = null;
		
		buffer = new StringBuffer();
		pathSegments = uriInfo.getPathSegments();
		queryParameters = uriInfo.getQueryParameters();
		
		for(PathSegment pathSegment: pathSegments){
			buffer.append("path: ").append(pathSegment.getPath()).append(" ")
			.append(extract(pathSegment.getMatrixParameters()));
			buffer.append("/n");
		}
		
		buffer.append("query parameters"+extract(queryParameters));
		buffer.append("/n");
		MultivaluedMap<String, String> headerMap = headers.getRequestHeaders();
		buffer.append("headers:"+extract(headerMap));
		buffer.append("/n");
		buffer.append("Cookies: ");
		Map<String, Cookie> cookieMap = headers.getCookies();
		for(String cookieName : cookieMap.keySet()){
			buffer.append(cookieName).append("-").append(cookieMap.get(cookieName).getValue());
			
		}
		
		return buffer.toString();
	}

	private Object extract(MultivaluedMap<String, String> matrixParams) {
		StringBuffer buffer = new StringBuffer();
		
		for(String paramName : matrixParams.keySet()){
			buffer.append(paramName).append(":");
			List<String> values = matrixParams.get(paramName);
			for(String value : values){
				buffer.append(value+" ");
			}
			buffer.append(";");
		}
		return buffer.toString();
	}
}
