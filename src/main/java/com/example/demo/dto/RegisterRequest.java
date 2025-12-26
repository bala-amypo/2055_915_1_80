package com.example.demo.dto;

public class RegisterRequest {
    private String username;
    private String password;
    private String role;
    private String branchName;
    private String email;

    public RegisterRequest() {
    }

    public RegisterRequest(String username, String password, String role, String branchName, String email) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.branchName = branchName;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getEmail() {
        return email;
    }
}
