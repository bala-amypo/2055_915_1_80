package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.dto.JwtResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserAccountController {

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest req) {
        // Dummy logic
        return ResponseEntity.ok("Dummy register: " + req.getName());
    }

    @PostMapping("/login")
    public ResponseEntity<JwtResponse> login(@RequestBody LoginRequest req) {
        // Dummy JWT response
        JwtResponse response = new JwtResponse();
        response.setToken("dummy-token-for-" + req.getEmail());
        return ResponseEntity.ok(response);
    }
}
