package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "academic_events")
public class AcademicEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private BranchProfile branch;

    @Column(nullable = false)
    private Boolean merged;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public AcademicEvent() {
    }

    public AcademicEvent(String title, LocalDate startDate, LocalDate endDate, BranchProfile branch) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.branch = branch;
    }

    @PrePersist
    public void prePersist() {
        this.merged = false;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BranchProfile getBranch() {
        return branch;
    }

    public void setBranch(BranchProfile branch) {
        this.branch = branch;
    }

    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
