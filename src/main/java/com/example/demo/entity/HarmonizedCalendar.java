package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.*;

@Entity
public class HarmonizedCalendar {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String generatedBy;
    private LocalDateTime generatedAt;
    private LocalDate effectiveFrom;
    private LocalDate effectiveTo;
    private String eventsJson;

    public HarmonizedCalendar() {}

    public HarmonizedCalendar(
            long id,
            String name,
            String generatedBy,
            LocalDateTime generatedAt,
            LocalDate effectiveFrom,
            LocalDate effectiveTo,
            String eventsJson) {

        this.id = id;
        this.name = name;
        this.generatedBy = generatedBy;
        this.generatedAt = generatedAt;
        this.effectiveFrom = effectiveFrom;
        this.effectiveTo = effectiveTo;
        this.eventsJson = eventsJson;
    }

    public String getGeneratedBy() { return generatedBy; }
    public LocalDateTime getGeneratedAt() { return generatedAt; }
    public LocalDate getEffectiveFrom() { return effectiveFrom; }
    public LocalDate getEffectiveTo() { return effectiveTo; }
    public String getEventsJson() { return eventsJson; }
}
