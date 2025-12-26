package com.example.demo.controller;

import com.example.demo.entity.UserAccount;
import com.example.demo.service.UserAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserAccountController {

    private final UserAccountService service;

    public UserAccountController(UserAccountService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UserAccount> create(@RequestBody UserAccount user) {
        return new ResponseEntity<>(service.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserAccount>> getAll() {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserAccount> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }
}
