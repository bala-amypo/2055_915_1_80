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
    public AcademicEvent createEvent(AcademicEvent event) {
        return eventRepository.save(event);
    }

    @Override
    public AcademicEvent updateEvent(Long id, AcademicEvent event) {
        AcademicEvent existing = getEventById(id);
        existing.setName(event.getName());
        existing.setStartDate(event.getStartDate());
        existing.setEndDate(event.getEndDate());
        existing.setBranchId(event.getBranchId());
        // Add other fields as necessary
        return eventRepository.save(existing);
    }

    @Override
    public AcademicEvent getEventById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id " + id));
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
        return eventRepository.findByBranchId(branchId);
    }
}
