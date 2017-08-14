package com.readlearncode.restserver;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Stateless
@Path("/http-headers")
public class HttpHeaderResource {

//    @Context
//    private HttpHeaders httpHeaders;
//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getAllHttpHeaders(){
//        return Response.ok(httpHeaders.getRequestHeaders()).build();
//    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response getUserAgentHttpHeaders(final @HeaderParam("user-agent") String userAgent){
//        return Response.ok(userAgent).build();
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllHttpHeaders(final @Context HttpHeaders httpHeaders){
        return Response.ok(httpHeaders.getRequestHeaders()).build();
    }

    @GET
    @Path("/{header-param}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Response getSpecifiedHeader(final @PathParam("header-param") String header_param, final @Context HttpHeaders httpHeaders){
        return Response.ok(httpHeaders.getRequestHeader(header_param)).build();
    }
}