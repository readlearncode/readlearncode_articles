package com.readlearncode.restserver;

import javax.servlet.ServletContext;
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
@Path("servlet-context")
public class ServletContextResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getContextPath(final @Context ServletContext servletContext) {
        return Response.ok(servletContext.getContextPath()).build();
    }

}