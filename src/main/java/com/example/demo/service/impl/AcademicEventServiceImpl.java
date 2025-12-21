package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.service.AcademicEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    @Autowired
    private AcademicEventRepository eventRepository;

    @Override
    public AcademicEvent saveEvent(AcademicEvent event) {
        // If using auto-generated ID, no need to manually set it
        return eventRepository.save(event);
    }

    @Override
    public List<AcademicEvent> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<AcademicEvent> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
