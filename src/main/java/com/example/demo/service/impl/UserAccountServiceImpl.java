package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl {

    private final UserAccountRepository repository;

    public UserAccountServiceImpl(UserAccountRepository repository) {
        this.repository = repository;
    }

    public UserAccount register(UserAccount user) {
        return repository.save(user);
    }

    public UserAccount getUser(long id) {
        return repository.findById(id).orElse(null);
    }
}
