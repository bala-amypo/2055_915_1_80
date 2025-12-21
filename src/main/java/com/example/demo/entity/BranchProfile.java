package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "branchCode"))
public class BranchProfile {

    @Id
    @GeneratedValue
    private Long id;

    private String branchCode;
    private String branchName;
    private String contactEmail;
    private Boolean active;
    private LocalDateTime lastSyncAt;

    @PrePersist
    void onCreate() {
        lastSyncAt = LocalDateTime.now();
    }


    public Long getId() {
        return id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getLastSyncAt() {
        return lastSyncAt;
    }
}
