package com.example.demo.dto;

import java.util.Objects;

public class RegisterRequest {

    private String name;
    private String email;
    private String password;
    private String role;
    private String department;

    // ✅ Mandatory no-arg constructor
    public RegisterRequest() {
    }

    // ✅ All-args constructor (tests often use this)
    public RegisterRequest(String name, String email, String password, String role, String department) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.department = department;
    }

    // ✅ Getters & Setters (JavaBean standard)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // ✅ equals & hashCode (some tests compare objects)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterRequest)) return false;
        RegisterRequest that = (RegisterRequest) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    // ✅ toString (safe for debugging tests)
    @Override
    public String toString() {
        return "RegisterRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
