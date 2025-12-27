package com.example.demo.service.impl;

import com.example.demo.entity.UserAccount;
import com.example.demo.exception.ValidationException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository repo;

    public UserAccountServiceImpl(UserAccountRepository repo) {
        this.repo = repo;
    }

    @Override
    public UserAccount register(String email, String password, String role) {
        return register(new UserAccount(email, password, role));
    }

    @Override
    public UserAccount register(UserAccount user) {
        if (repo.existsByEmail(user.getEmail())) {
            throw new ValidationException("Email already exists");
        }
        if (user.getPassword() == null || user.getPassword().length() < 6) {
            throw new ValidationException("Password too short");
        }
        return repo.save(user);
    }

    @Override
    public UserAccount findByEmail(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
}
