package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * CustomUserDetailsService implements Spring Security's UserDetailsService.
 * It is responsible for loading user details during authentication.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    /**
     * Loads a user by username.
     * @param username the username identifying the user whose data is required.
     * @return UserDetails object with username, password, and authorities.
     * @throws UsernameNotFoundException if the user is not found.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // For demonstration, a dummy user is provided.
        // Replace this with actual DB lookup logic.
        if ("admin".equals(username)) {
            // {noop} means no password encoder is used. Replace with bcrypt in production.
            return new User("admin", "{noop}password", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
