package com.sukesh.micro.provider.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("micro")
public class RestFulJerseyConfig extends ResourceConfig {
    public RestFulJerseyConfig() {
        packages("com.sukesh.micro.provider.resource");
    }
}