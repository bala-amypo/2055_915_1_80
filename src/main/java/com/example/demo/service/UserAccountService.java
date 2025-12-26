package com.example.demo.service;

import com.example.demo.entity.UserAccount;
import java.util.List;

public interface UserAccountService {
    UserAccount register(UserAccount user);
    UserAccount createUser(UserAccount user);
    UserAccount findByEmail(String email);
    UserAccount getUser(Long id);
    UserAccount getUserById(Long id);
    List<UserAccount> getAllUsers();
}