package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserAccount;
import com.example.demo.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Override
    public UserAccount register(UserAccount user) {
        return user;
    }

    @Override
    public String login(String username, String password) {
        return "dummy-jwt-token";
    }

    @Override
    public UserAccount findByEmail(String email) {
        return null;
    }

    @Override
    public List<UserAccount> getAll() {
        return List.of();
    }

    @Override
    public UserAccount getById(Long id) {
        return null;
    }
}
