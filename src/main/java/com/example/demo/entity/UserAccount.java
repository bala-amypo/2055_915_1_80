package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;
    private String email;
    private String branchCode;
    private LocalDateTime createdAt;

    public UserAccount() {
        this.createdAt = LocalDateTime.now();
    }

    public UserAccount(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.createdAt = LocalDateTime.now();
    }

    public UserAccount(Long id, String username, String password,
                       String role, String email,
                       String branchCode, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.branchCode = branchCode;
        this.createdAt = createdAt;
    }

    // 🔴 REQUIRED BY TESTS
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getEmail() { return email; }
    public String getBranchCode() { return branchCode; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
    public void setEmail(String email) { this.email = email; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }
}
