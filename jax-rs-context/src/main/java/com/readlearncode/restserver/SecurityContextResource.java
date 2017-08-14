package com.readlearncode.restserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/security-context")
public class SecurityContextResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response sayHello(final @Context SecurityContext securityContext) {
        return Response.ok(securityContext.isUserInRole("guest")).build();
    }

}