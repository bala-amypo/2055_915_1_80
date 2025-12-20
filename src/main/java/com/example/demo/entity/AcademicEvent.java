package com.example.demo.entity;

import com.example.demo.exception.ValidationException;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class AcademicEvent {

    @Id
    @GeneratedValue
    private Long id;

    private Long branchId;
    private String title;
    private String eventType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private String description;
    private LocalDateTime submittedAt;

    @PrePersist
    public void validate() {
        if (startDate.isAfter(endDate)) {
            throw new ValidationException("Invalid date range");
        }
        submittedAt = LocalDateTime.now();
    }

    public Long getId() { return id; }
}
