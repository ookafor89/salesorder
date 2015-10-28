package com.javacodegeeks.ws.product_service;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/SalesOrderService")
public class SalesOrderService {
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public ClaimStatus status(@PathParam("body") String custId){
		return null;
	}
}
