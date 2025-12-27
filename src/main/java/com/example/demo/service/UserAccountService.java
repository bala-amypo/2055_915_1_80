package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.UserAccount;

public interface UserAccountService {

    UserAccount register(UserAccount user);

    String login(String username, String password);

    UserAccount findByEmail(String email);

    List<UserAccount> getAll();

    UserAccount getById(Long id);
}
