package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ClashRecord {

    @Id
    @GeneratedValue
    private Long id;

    private Long eventAId;
    private Long eventBId;
    private String clashType;
    private String severity;
    private String details;
    private boolean resolved = false;
    private LocalDateTime detectedAt;

    @PrePersist
    public void prePersist() {
        detectedAt = LocalDateTime.now();
    }
}
