package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.*;

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
    private LocalDateTime submittedAt;

    public AcademicEvent() {}

    public AcademicEvent(
            long id,
            Long branchId,
            String title,
            String eventType,
            LocalDate startDate,
            LocalDate endDate,
            String s1,
            String s2,
            LocalDateTime submittedAt) {

        this.id = id;
        this.branchId = branchId;
        this.title = title;
        this.eventType = eventType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.submittedAt = submittedAt;
    }

    public Long getBranchId() { return branchId; }
    public void setBranchId(long branchId) { this.branchId = branchId; }
    public void setEventType(String eventType) { this.eventType = eventType; }
    public LocalDateTime getSubmittedAt() { return submittedAt; }
}
