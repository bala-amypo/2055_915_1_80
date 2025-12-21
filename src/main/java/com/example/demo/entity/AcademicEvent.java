package com.example.demo.entity;

import com.example.demo.exception.ValidationException;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
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
    void onCreate() {
        if (startDate.isAfter(endDate)) {
            throw new ValidationException("Start date must be before end date");
        }
        submittedAt = LocalDateTime.now();
    }
}
