package com.tutorial.oauth2.controller;

import com.tutorial.oauth2.model.User;
import com.tutorial.oauth2.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping(value = "/demo", consumes = MediaType.ALL_VALUE)
    public String userAuthentication(){
        return "private";
    }

    @GetMapping(value = "/", consumes = MediaType.ALL_VALUE)
    public String test(){
        return "prhelloivate";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userDetailsService.getAllUsers();
    }

    @GetMapping(value = "/createUser")
    public void createUser(@RequestBody User user){
        userDetailsService.createUser(user);
    }

    @GetMapping(value = "/deleteUser")
    public void deleteUser(@RequestParam String userName){
        userDetailsService.deleteUser(userName);
    }

    @GetMapping(value = "/updateUser")
    public Integer updateUser(@RequestParam String userName, @RequestParam Long id){
        return userDetailsService.updateUserById(userName, id);
    }

    @GetMapping(value = "/searchUser")
    public User searchUser(@RequestParam String character){
        return userDetailsService.searchUser(character);
    }

    @GetMapping(value = "/searchUser/{id}/{userName}")
    public List<User> searchUser(@PathVariable(name = "id") Long id, @PathVariable(name = "userName") String userName){
        return userDetailsService.searchUser(id,userName);
    }

}
