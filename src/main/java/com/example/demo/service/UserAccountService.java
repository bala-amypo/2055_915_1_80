package com.example.demo.service;

import com.example.demo.entity.UserAccount;

public interface UserAccountService {
    UserAccount register(String email, String password, String role);
    UserAccount findByEmail(String email);
}
