package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clash_records")
public class ClashRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_one_id", nullable = false)
    private AcademicEvent eventOne;

    @ManyToOne
    @JoinColumn(name = "event_two_id", nullable = false)
    private AcademicEvent eventTwo;

    @Column(nullable = false)
    private String severity;

    @Column(nullable = false)
    private LocalDateTime detectedAt;

    public ClashRecord() {
    }

    public ClashRecord(AcademicEvent eventOne, AcademicEvent eventTwo, String severity) {
        this.eventOne = eventOne;
        this.eventTwo = eventTwo;
        this.severity = severity;
    }

    @PrePersist
    public void prePersist() {
        this.detectedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AcademicEvent getEventOne() {
        return eventOne;
    }

    public void setEventOne(AcademicEvent eventOne) {
        this.eventOne = eventOne;
    }

    public AcademicEvent getEventTwo() {
        return eventTwo;
    }

    public void setEventTwo(AcademicEvent eventTwo) {
        this.eventTwo = eventTwo;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }

    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }
}
