package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.EventMergeRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.repository.EventMergeRecordRepository;
import com.example.demo.service.EventMergeService;
import org.springframework.stereotype.Service;

@Service
public class EventMergeServiceImpl implements EventMergeService {

    private final AcademicEventRepository eventRepo;
    private final EventMergeRecordRepository mergeRepo;

    public EventMergeServiceImpl(AcademicEventRepository eventRepo,
                                 EventMergeRecordRepository mergeRepo) {
        this.eventRepo = eventRepo;
        this.mergeRepo = mergeRepo;
    }

    @Override
    public void mergeEvents(Long eventId, String mergedGroupId) {
        AcademicEvent event = eventRepo.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
        event.setMerged(true);
        eventRepo.save(event);
        mergeRepo.save(new EventMergeRecord(event, mergedGroupId));
    }
}
