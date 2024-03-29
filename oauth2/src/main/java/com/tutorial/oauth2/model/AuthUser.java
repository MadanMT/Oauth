package com.tutorial.oauth2.model;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class AuthUser implements UserDetails {
    private String userName;
    private String password;
    Collection<? extends GrantedAuthority> authorities;

    public AuthUser(User user) {
        this.userName = user.getUserName();
        this.password = user.getPassword();
        List<GrantedAuthority> auths = new ArrayList<>();
        for (Role role : user.getRoles()){
            auths.add(new SimpleGrantedAuthority(role.getName().toUpperCase(Locale.ROOT)));
        }
        this.authorities =auths;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
