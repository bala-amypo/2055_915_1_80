package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository repository;

    public UserAccountServiceImpl() {
    }

    @Override
    public UserAccount save(UserAccount user) {
        return repository.save(user);
    }

    @Override
    public UserAccount findByUsername(String username) {
        return repository.findByUsername(username).orElse(null);
    }
}
