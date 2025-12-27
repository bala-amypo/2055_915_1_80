package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserAccount;
import com.example.demo.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final List<UserAccount> store = new ArrayList<>();

    @Override
    public UserAccount register(UserAccount user) {
        store.add(user);
        return user;
    }

    @Override
    public String login(String username, String password) {
        return "dummy-jwt-token";
    }

    @Override
    public UserAccount findByEmail(String email) {
        return store.stream()
                .filter(u -> email.equals(u.getEmail()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<UserAccount> getAll() {
        return store;
    }

    @Override
    public UserAccount getById(Long id) {
        return getUser(id);
    }

    // 🔴 REQUIRED BY TESTS
    public UserAccount getUser(long id) {
        return store.stream()
                .filter(u -> u.getId() != null && u.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
