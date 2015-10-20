package org.honeybadger.example.resource;

import org.honeybadger.core.jaxrs.Resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by tlhs on 19-10-15.
 */
@Path("/example")
public class ExampleResource implements Resource {

    @GET
    public Response get() {
        return Response.ok("Hello world!").build();
    }
}
