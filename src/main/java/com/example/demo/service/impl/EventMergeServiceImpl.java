package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.EventMergeRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.repository.EventMergeRecordRepository;
import com.example.demo.service.EventMergeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventMergeServiceImpl implements EventMergeService {
    private final EventMergeRecordRepository eventMergeRecordRepository;
    private final AcademicEventRepository academicEventRepository;

    public EventMergeServiceImpl(EventMergeRecordRepository eventMergeRecordRepository, AcademicEventRepository academicEventRepository) {
        this.eventMergeRecordRepository = eventMergeRecordRepository;
        this.academicEventRepository = academicEventRepository;
    }

    @Override
    public EventMergeRecord mergeEvents(List<Long> eventIds, String reason) {
        List<AcademicEvent> events = academicEventRepository.findAllById(eventIds);
        if (events.isEmpty()) {
            throw new ResourceNotFoundException("No events found");
        }

        String sourceIds = eventIds.stream().map(String::valueOf).collect(Collectors.joining(","));
        LocalDate earliestStart = events.stream().map(AcademicEvent::getStartDate).min(LocalDate::compareTo).orElse(LocalDate.now());
        LocalDate latestEnd = events.stream().map(AcademicEvent::getEndDate).max(LocalDate::compareTo).orElse(LocalDate.now());

        EventMergeRecord mergeRecord = new EventMergeRecord();
        mergeRecord.setSourceEventIds(sourceIds);
        mergeRecord.setMergedTitle("Merged Events");
        mergeRecord.setMergedStartDate(earliestStart);
        mergeRecord.setMergedEndDate(latestEnd);
        mergeRecord.setMergeReason(reason);

        return eventMergeRecordRepository.save(mergeRecord);
    }

    @Override
    public List<EventMergeRecord> getAllMergeRecords() {
        return eventMergeRecordRepository.findAll();
    }

    @Override
    public EventMergeRecord getMergeRecordById(Long id) {
        return eventMergeRecordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Merge record not found"));
    }

    @Override
    public List<EventMergeRecord> getMergeRecordsByDate(LocalDate start, LocalDate end) {
        return eventMergeRecordRepository.findByMergedStartDateBetween(start, end);
    }

    @Override
    public EventMergeRecord mergeEvent(EventMergeRecord eventMergeRecord) {
        return eventMergeRecordRepository.save(eventMergeRecord);
    }

    @Override
    public List<EventMergeRecord> getAllMergedEvents() {
        return getAllMergeRecords();
    }

    @Override
    public EventMergeRecord mergeEvent(EventMergeRecord eventMergeRecord) {
        return eventMergeRecordRepository.save(eventMergeRecord);
    }

    @Override
    public List<EventMergeRecord> getAllMergedEvents() {
        return getAllMergeRecords();
    }
}