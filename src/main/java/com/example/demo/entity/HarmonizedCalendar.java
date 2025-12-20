package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class HarmonizedCalendar {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String generatedBy;
    private LocalDateTime generatedAt;
    private LocalDate effectiveFrom;
    private LocalDate effectiveTo;

    @Column(columnDefinition = "TEXT")
    private String eventsJson;

    @PrePersist
    public void prePersist() {
        generatedAt = LocalDateTime.now();
    }
}
