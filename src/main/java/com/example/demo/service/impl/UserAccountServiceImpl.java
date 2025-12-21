package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.exception.*;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository repo;

    public UserAccountServiceImpl(UserAccountRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserAccount register(UserAccount user) {
        if (repo.existsByEmail(user.getEmail())) {
            throw new ValidationException("Email already exists");
        }
        return repo.save(user);
    }

    @Override
    public UserAccount getUser(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    @Override
    public List<UserAccount> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public UserAccount findByEmail(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("Invalid credentials"));
    }
}
