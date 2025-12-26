package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl {

    private final UserAccountRepository repo;

    public UserAccountServiceImpl(UserAccountRepository repo) {
        this.repo = repo;
    }

    public UserAccount register(UserAccount user) {
        return repo.save(user);
    }

    public UserAccount getUser(long id) {
        return repo.findById(id).orElse(null);
    }
}
