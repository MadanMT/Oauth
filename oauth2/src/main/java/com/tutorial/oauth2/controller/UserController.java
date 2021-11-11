package com.tutorial.oauth2.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
//    @Autowired
//    private UserRepository1 userRepository;

    @GetMapping(value = "/demo", consumes = MediaType.ALL_VALUE)
    public String userAuthentication(){
        return "private";
    }

    @GetMapping(value = "/", consumes = MediaType.ALL_VALUE)
    public String test(){
        return "prhelloivate";
    }
}
