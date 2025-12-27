package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.UserAccount;

public interface UserAccountService {

    String login(String username, String password);

    List<UserAccount> getAll();

    UserAccount getById(Long id);
}
