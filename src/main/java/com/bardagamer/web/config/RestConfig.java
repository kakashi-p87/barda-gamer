package com.bardagamer.web.config;

import com.bardagamer.web.rest.UserController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("api/v1")
public class RestConfig extends ResourceConfig {

    public RestConfig(){
        register(UserController.class);
    }
}
