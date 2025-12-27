package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BranchProfile {

    @Id
    @GeneratedValue
    private Long id;

    private String branchCode;
    private String branchName;
    private String contactEmail;
    private boolean active = true;
    private LocalDateTime lastSyncAt;

    @PrePersist
    public void prePersist() {
        this.lastSyncAt = LocalDateTime.now();
        this.active = true;
    }

    public boolean getActive() { return active; }
    public LocalDateTime getLastSyncAt() { return lastSyncAt; }

    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }
    public void setBranchName(String branchName) { this.branchName = branchName; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }
}
