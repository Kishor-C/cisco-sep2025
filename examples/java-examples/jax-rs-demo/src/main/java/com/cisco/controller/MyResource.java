package com.cisco.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1")
public class MyResource {

	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public Response greet() {
		String success = "Success content";
		String error = "Error content";
		double random = Math.random();
		if(random > 0.5) {
			return Response.status(200).entity(success+" random number is "+random).build();
		} else {
			return Response.status(404).entity(error+" random number is "+random).build();
		}
	}
}
