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
    private String branchName;
    private String email;
    private LocalDateTime createdAt;

    public UserAccount() {}

    public UserAccount(Long id, String username, String password, String role,
                       String branchName, String email, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.branchName = branchName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public void setId(Long id) { this.id = id; }
    public Long getId() { return id; }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getBranchName() { return branchName; }
    public String getEmail() { return email; }
}
