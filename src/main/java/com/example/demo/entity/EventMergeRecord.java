package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event_merge_records")
public class EventMergeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private AcademicEvent event;

    @Column(nullable = false)
    private String mergedGroupId;

    @Column(nullable = false)
    private LocalDateTime mergedAt;

    public EventMergeRecord() {
    }

    public EventMergeRecord(AcademicEvent event, String mergedGroupId) {
        this.event = event;
        this.mergedGroupId = mergedGroupId;
    }

    @PrePersist
    public void prePersist() {
        this.mergedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AcademicEvent getEvent() {
        return event;
    }

    public void setEvent(AcademicEvent event) {
        this.event = event;
    }

    public String getMergedGroupId() {
        return mergedGroupId;
    }

    public void setMergedGroupId(String mergedGroupId) {
        this.mergedGroupId = mergedGroupId;
    }

    public LocalDateTime getMergedAt() {
        return mergedAt;
    }

    public void setMergedAt(LocalDateTime mergedAt) {
        this.mergedAt = mergedAt;
    }
}
