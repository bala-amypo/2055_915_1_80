package com.example.demo.controller;

import com.example.demo.dto.*;
import com.example.demo.entity.UserAccount;
import com.example.demo.security.JwtUtil;
import com.example.demo.service.UserAccountService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication")
public class UserAccountController {

    private final UserAccountService service;
    private final JwtUtil jwtUtil;

    public UserAccountController(UserAccountService service, JwtUtil jwtUtil) {
        this.service = service;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/register")
    public UserAccount register(@RequestBody RegisterRequest req) {
        UserAccount user = new UserAccount();
        user.setFullName(req.getName());
        user.setEmail(req.getEmail());
        user.setRole(req.getRole());
        user.setDepartment(req.getDepartment());
        return service.register(user);
    }

    @PostMapping("/login")
    public JwtResponse login(@RequestBody LoginRequest req) {
        return new JwtResponse(jwtUtil.generateToken(req.getEmail()));
    }

    @GetMapping("/users")
    public List<UserAccount> getAll() {
        return service.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public UserAccount getById(@PathVariable Long id) {
        return service.getUser(id);
    }
}
