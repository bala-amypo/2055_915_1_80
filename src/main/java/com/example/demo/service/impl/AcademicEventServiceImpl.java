package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.service.AcademicEventService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    @Override
    public AcademicEvent createEvent(AcademicEvent event) {
        return event;
    }

    @Override
    public List<AcademicEvent> getEventsByBranch(long branchId) {
        return List.of();
    }
}
