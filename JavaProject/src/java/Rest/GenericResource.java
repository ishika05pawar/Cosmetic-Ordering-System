/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package Rest;

import EJB.catLocal;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author ishika
 */
@Path("generic")
public class GenericResource {
    @EJB catLocal cl;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of Rest.GenericResource
     * @return an instance of java.lang.String
     */
   
    @RolesAllowed("admin")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        //TODO return proper representation object
       // throw new UnsupportedOperationException();
       return cl.saySecureHello()+ " from Rest Client";
    }
    @POST
    @Path("insert/{category}")
    public void insert(@PathParam("category")String category)
    {
        cl.insert(category);
    }


    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
