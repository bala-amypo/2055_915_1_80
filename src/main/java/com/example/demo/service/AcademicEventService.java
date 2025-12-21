package com.example.demo.service;

import com.example.demo.entity.AcademicEvent;
import java.util.List;

public interface AcademicEventService {
    AcademicEvent saveEvent(AcademicEvent event);
    List<AcademicEvent> getAllEvents();
}
