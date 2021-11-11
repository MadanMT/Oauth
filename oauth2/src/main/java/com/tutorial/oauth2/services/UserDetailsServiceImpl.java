package com.tutorial.oauth2.services;

import com.tutorial.oauth2.model.AuthUser;
import com.tutorial.oauth2.model.User;
import com.tutorial.oauth2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("User name is  ==== "+username);
        User user = userRepository.findByuserName(username);
        if (user == null)throw new UsernameNotFoundException("User name not found");
        UserDetails userDetails = new AuthUser(user);
        return userDetails;
    }
}
