package com.readlearncode.restserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Path("request")
public class RequestResource {

    private Map<Integer, Employee> database = new ConcurrentHashMap<>();

    {
        database.put(1, new Employee(10_000));
    }

    class Employee {
        public Employee(float salary){
            salary = salary;
        }
        public float salary;
    }
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateEmployee(@PathParam("id") int id,
                                   @Context Request request,
                                   Employee emp) {

        Employee employee = database.get(id);
        EntityTag tag = new EntityTag(Integer.toString(employee.hashCode()));
        Response.ResponseBuilder builder = request.evaluatePreconditions(tag);

        if (builder != null) {
            // Preconditions not met so return
            return builder.build();
        }

        // Preconditions met so update employee
        employee.salary = emp.salary;

        return Response.noContent().build();
    }



}