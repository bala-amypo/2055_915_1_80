package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.*;

@Entity
public class EventMergeRecord {

    @Id
    @GeneratedValue
    private Long id;

    private String sourceEventIds;
    private String mergedTitle;
    private LocalDate mergedStartDate;
    private LocalDate mergedEndDate;
    private String mergeReason;
    private LocalDateTime createdAt;

    public EventMergeRecord() {}

    public EventMergeRecord(
            long id,
            String sourceEventIds,
            String mergedTitle,
            LocalDate mergedStartDate,
            LocalDate mergedEndDate,
            String mergeReason,
            LocalDateTime createdAt) {

        this.id = id;
        this.sourceEventIds = sourceEventIds;
        this.mergedTitle = mergedTitle;
        this.mergedStartDate = mergedStartDate;
        this.mergedEndDate = mergedEndDate;
        this.mergeReason = mergeReason;
        this.createdAt = createdAt;
    }

    public String getSourceEventIds() { return sourceEventIds; }
    public void setSourceEventIds(String sourceEventIds) { this.sourceEventIds = sourceEventIds; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
