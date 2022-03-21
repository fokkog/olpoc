package com.gits.rest;

import java.util.Properties;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gits.service.HelloService;

@Path("properties")
public class PropertiesController {

    @EJB
    private HelloService helloService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Properties getProperties() {
        return System.getProperties();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return helloService.hello();
    }

}