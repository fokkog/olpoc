package com.gits.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloService {
    
    public String hello() {
        return "Hello from local bean";
    }
    
}
