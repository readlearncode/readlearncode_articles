package com.readlearncode.restserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public Integer add(@QueryParam("x") int x, @QueryParam("y") int y) {
        return x + y;
    }

}