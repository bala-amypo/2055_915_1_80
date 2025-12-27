package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ClashRecord {

    @Id
    @GeneratedValue
    private Long id;

    private long eventAId;
    private long eventBId;
    private String clashType;
    private String severity;
    private String description;
    private LocalDateTime detectedAt;
    private boolean resolved;

    public ClashRecord() {}

    public ClashRecord(
            long id,
            long eventAId,
            long eventBId,
            String clashType,
            String severity,
            String description,
            LocalDateTime detectedAt,
            boolean resolved) {

        this.id = id;
        this.eventAId = eventAId;
        this.eventBId = eventBId;
        this.clashType = clashType;
        this.severity = severity;
        this.description = description;
        this.detectedAt = detectedAt;
        this.resolved = resolved;
    }

    public long getEventAId() { return eventAId; }
    public long getEventBId() { return eventBId; }
    public boolean getResolved() { return resolved; }
    public void setResolved(boolean resolved) { this.resolved = resolved; }
}
