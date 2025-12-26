package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.service.UserAccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Override
    public UserAccount createUser(UserAccount user) {
        return user;
    }

    @Override
    public UserAccount getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return new ArrayList<>();
    }
}
