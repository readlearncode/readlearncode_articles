package com.readlearncode.restserver;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/remote-address")
public class HttpServletRequestResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRemoteAddress(final @Context HttpServletRequest httpServletRequest){
        return Response.ok(httpServletRequest.getRemoteAddr()).build();
    }

}