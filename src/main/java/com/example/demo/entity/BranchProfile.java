package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "branch_profiles")
public class BranchProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String branchCode;
    private String branchName;
    private String location;
    private boolean active;

    @OneToOne
    private UserAccount user;

    private LocalDateTime createdAt;

    public BranchProfile() {
        this.createdAt = LocalDateTime.now();
    }

    public BranchProfile(String branchCode, String branchName, UserAccount user) {
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.user = user;
        this.createdAt = LocalDateTime.now();
        this.active = true;
    }

    // 🔴 REQUIRED BY TESTS
    public BranchProfile(Long id, String branchCode, String branchName,
                         String location, LocalDateTime createdAt, boolean active) {
        this.id = id;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.location = location;
        this.createdAt = createdAt;
        this.active = active;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getBranchCode() { return branchCode; }
    public String getBranchName() { return branchName; }
    public String getLocation() { return location; }
    public boolean isActive() { return active; }

    public void setActive(boolean active) { this.active = active; }
}
