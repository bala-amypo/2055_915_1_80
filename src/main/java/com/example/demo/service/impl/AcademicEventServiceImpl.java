package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.service.AcademicEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    @Autowired
    private AcademicEventRepository eventRepository;

    @Override
    public AcademicEvent saveEvent(AcademicEvent event) {
        return eventRepository.save(event);
    }

    @Override
    public AcademicEvent getEventById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<AcademicEvent> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public List<AcademicEvent> getEventsByBranch(Long branchId) {
        // Implement based on your schema, e.g., if you have branchId in AcademicEvent:
        return eventRepository.findByBranchId(branchId);
    }
}
