package com.example.demo.controller;

import com.example.demo.entity.UserAccount;
import com.example.demo.service.UserAccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Authentication")
public class UserAccountController {

    private final UserAccountService service;

    public UserAccountController(UserAccountService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public UserAccount register(@RequestBody UserAccount user) {
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {
        return service.login(email, password);
    }

    @GetMapping("/users")
    public List<UserAccount> getAllUsers() {
        return service.getAll();
    }

    @GetMapping("/users/{id}")
    public UserAccount getUserById(@PathVariable Long id) {
        return service.getById(id);
    }
}
