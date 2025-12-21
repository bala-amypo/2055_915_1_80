package com.example.demo.service;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.repository.AcademicEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    private final AcademicEventRepository repository;

    public AcademicEventServiceImpl(AcademicEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public AcademicEvent saveEvent(AcademicEvent event) {
        return repository.save(event);
    }

    @Override
    public List<AcademicEvent> getAllEvents() {
        return repository.findAll();
    }
}
