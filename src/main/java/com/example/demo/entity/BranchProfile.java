package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class BranchProfile {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String branchCode;

    private String branchName;
    private String contactEmail;
    private boolean active;
    private LocalDateTime lastSyncAt;

    @PrePersist
    public void prePersist() {
        lastSyncAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
}
