package com.example.demo.service;

import com.example.demo.entity.AcademicEvent;

import java.time.LocalDate;
import java.util.List;

public interface AcademicEventService {
    AcademicEvent createEvent(Long branchId, String title, LocalDate startDate, LocalDate endDate);
    List<AcademicEvent> getEventsByBranch(Long branchId);
}
