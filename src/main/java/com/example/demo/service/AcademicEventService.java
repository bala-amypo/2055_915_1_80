package com.example.demo.service;

import com.example.demo.entity.AcademicEvent;

import java.util.List;

public interface AcademicEventService {
    AcademicEvent saveEvent(AcademicEvent event);

    AcademicEvent getEventById(Long id);   // Return type: AcademicEvent

    void deleteEvent(Long id);

    List<AcademicEvent> getAllEvents();

    List<AcademicEvent> getEventsByBranch(Long branchId);  // must exist
}
