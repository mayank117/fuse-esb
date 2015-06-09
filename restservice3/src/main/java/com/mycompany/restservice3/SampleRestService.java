package com.mycompany.restservice3;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;


@Path("/")
public class SampleRestService {

	@Produce
	ProducerTemplate producerTemplate;

	@GET
	@Path("hello")
	public Response echo(@QueryParam("param") String request) {
		ResponseBuilder response = Response.ok(request,
				MediaType.TEXT_HTML);
		return response.build();
	}

	@POST
	@Path("/sample/")
	@Consumes("application/xml")
	@Produces("application/xml")
	public Response samplePost(String sample) {

		String response = producerTemplate.requestBody("direct:sample", "hello", String.class);

		final ResponseBuilder responseBuilder = Response.ok(response,
				MediaType.APPLICATION_XML_TYPE);
		return responseBuilder.build();

	}
}
