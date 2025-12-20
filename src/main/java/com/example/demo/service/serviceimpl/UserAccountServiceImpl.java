package com.example.demo.serviceimpl;

import com.example.demo.entity.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.UserAccountService;
import com.example.demo.exception.ValidationException;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository repository;

    public UserAccountServiceImpl(UserAccountRepository repository) {
        this.repository = repository;
    }

    public UserAccount register(UserAccount user) {
        if (repository.existsByEmail(user.getEmail())) {
            throw new ValidationException("Email already exists");
        }
        return repository.save(user);
    }

    public UserAccount getUser(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

    public List<UserAccount> getAllUsers() {
        return repository.findAll();
    }

    public UserAccount findByEmail(String email) {
        return repository.findAll().stream()
                .filter(u -> u.getEmail().equals(email))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }
}
