package com.example.demo.serviceimpl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.service.AcademicEventService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    private final AcademicEventRepository repository;

    public AcademicEventServiceImpl(AcademicEventRepository repository) {
        this.repository = repository;
    }

    public AcademicEvent createEvent(AcademicEvent event) {
        return repository.save(event);
    }

    public List<AcademicEvent> getEventsByBranch(Long branchId) {
        return repository.findByBranchId(branchId);
    }

    public AcademicEvent updateEvent(Long id, AcademicEvent event) {
        AcademicEvent existing = getEventById(id);
        event.setId(existing.getId());
        return repository.save(event);
    }

    public AcademicEvent getEventById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
    }

    public List<AcademicEvent> getAllEvents() {
        return repository.findAll();
    }
}
