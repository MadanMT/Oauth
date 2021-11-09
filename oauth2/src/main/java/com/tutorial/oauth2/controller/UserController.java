package com.tutorial.oauth2.controller;

import com.tutorial.oauth2.dob.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/userLogin", consumes = MediaType.ALL_VALUE)
    public String userAuthentication(){
        return "private";
    }

    @GetMapping(value = "/", consumes = MediaType.ALL_VALUE)
    public String test(){
        return "prhelloivate";
    }
}
