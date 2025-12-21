package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
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
}
