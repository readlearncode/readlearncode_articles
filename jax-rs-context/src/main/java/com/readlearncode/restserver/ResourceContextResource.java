package com.readlearncode.restserver;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/resource-context")
public class ResourceContextResource {

    @GET
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(final @Context ResourceContext resourceContext, final @Context UriInfo uriInfo) {
        final CalculatorResource calculatorResource = resourceContext.getResource(CalculatorResource.class);
        int x = Integer.valueOf(uriInfo.getQueryParameters().getFirst("x"));
        int y = Integer.valueOf(uriInfo.getQueryParameters().getFirst("y"));
        return Response.ok(calculatorResource.add(x, y)).build();
    }

}