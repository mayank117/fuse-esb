package com.mycompany.cxf.transform.cxf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class EndPointService {
	
	@POST
	@Path("/resource")
	//@Produces(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes({"application/xml","application/json"})
	public void putPerson(Person bean) {
	}
	
	
	@GET
	@Path("/ping")
	//@Produces(MediaType.TEXT_PLAIN)
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Response testMethod() {
		System.out.println("inside test method");
		return Response.ok().build();
		//return bean;
	}

}
