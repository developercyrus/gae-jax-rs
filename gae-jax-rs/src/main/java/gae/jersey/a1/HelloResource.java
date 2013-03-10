package gae.jersey.a1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("hello") 
public class HelloResource {
    
    @GET
    @Path("xml")
    @Produces("application/xml") 
    public Hello createPersonByXml() { 
        Hello p = new Hello();
        p.setName("Helloworld by xml");
        return p;
    } 

    @GET
    @Path("json")
    @Produces("application/json") 
    public Hello createPersonByJson() { 
        Hello p = new Hello();
        p.setName("Helloworld by json");
        return p;
    }

    @GET
    @Path("{id}")
    public String findPerson(@PathParam("id") String id){
        Hello p = new Hello();
        p.setName("Helloworld " + id);
        return p.getName();
    }
}
