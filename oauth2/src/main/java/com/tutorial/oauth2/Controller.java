package com.tutorial.oauth2;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class Controller {
    @GetMapping(value = "/login", consumes = MediaType.ALL_VALUE)
    public String helloWorld(){
        return "Hello world";
    }
    @GetMapping("/restricted")
    public String restricted(){
    return "Tp see this page please login";
    }

}
