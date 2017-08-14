package com.readlearncode.restserver;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/output")
public class HttpServletResponseResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(final @Context HttpServletResponse httpServletResponse) throws IOException {

        ServletOutputStream out = httpServletResponse.getOutputStream();
        out.print("Hello");
        out.flush();

        return Response.ok().build();
    }
}