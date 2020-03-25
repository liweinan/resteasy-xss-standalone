package io.weli.resteasy.xss;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UsersResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Integer page(@QueryParam("paging") Integer page) {
        return page;
    }
}
