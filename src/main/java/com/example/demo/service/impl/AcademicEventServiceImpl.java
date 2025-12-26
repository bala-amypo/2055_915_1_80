package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.service.AcademicEventService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    @Override
    public AcademicEvent createEvent(AcademicEvent event) {
        return event;
    }

    @Override
    public AcademicEvent getEventById(Long id) {
        return null;
    }

    @Override
    public List<AcademicEvent> getAllEvents() {
        return new ArrayList<>();
    }
}
