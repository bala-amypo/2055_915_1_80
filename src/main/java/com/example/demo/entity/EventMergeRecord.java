package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class EventMergeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sourceEventIds;
    private String mergeReason;
    private String mergedTitle;
    private LocalDate mergedStartDate;
    private LocalDate mergedEndDate;
    private LocalDateTime createdAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }

    public void setSourceEventIds(String sourceEventIds) {
        this.sourceEventIds = sourceEventIds;
    }

    public void setMergeReason(String mergeReason) {
        this.mergeReason = mergeReason;
    }
}
