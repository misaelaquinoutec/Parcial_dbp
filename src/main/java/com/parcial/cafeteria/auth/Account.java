package com.parcial.cafeteria.auth;

import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;

@Entity 
public class Account implements UserDatails{

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       
        return Account.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getName()))
                .collect(Collectors.toList());
    }

    public String getPassword() { return password; }

    @Override
    public String getUsername() { return this.email; }


}

