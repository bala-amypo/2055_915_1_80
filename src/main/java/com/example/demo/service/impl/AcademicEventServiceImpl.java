package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.service.AcademicEventService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    @Override
    public AcademicEvent create(AcademicEvent event) {
        return event;
    }

    @Override
    public AcademicEvent update(Long id, AcademicEvent event) {
        return event;
    }

    @Override
    public List<AcademicEvent> getByBranch(Long branchId) {
        return List.of();
    }

    @Override
    public AcademicEvent getById(Long id) {
        return null;
    }

    @Override
    public List<AcademicEvent> getAll() {
        return List.of();
    }
}
