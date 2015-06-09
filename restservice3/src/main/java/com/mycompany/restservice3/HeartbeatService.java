package com.mycompany.restservice3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


@Path("/")
public class HeartbeatService {
	@Context
	private UriInfo	uriInfo;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response get() {
		return null;
	}
}
