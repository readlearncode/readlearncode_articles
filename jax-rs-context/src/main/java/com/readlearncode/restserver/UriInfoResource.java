package com.readlearncode.restserver;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
@Stateless
@Path("/uri-info")
public class UriInfoResource {

    @Context
    private UriInfo uriInfo;

    /* These method paths clash and cannot be used together.*/
    @GET
    @Path("/{search}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getQueryParameters(final @Context UriInfo uriInfo){
        return Response.ok(uriInfo.getQueryParameters()).build();
    }

//    @GET
//    @Path("/{path: .*}")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getPathParameters(final @Context UriInfo uriInfo){
//        return Response.ok(uriInfo.getPathParameters()).build();
//    }



}