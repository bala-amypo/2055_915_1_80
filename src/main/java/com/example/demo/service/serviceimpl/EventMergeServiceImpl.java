package com.example.demo.serviceimpl;

import com.example.demo.entity.EventMergeRecord;
import com.example.demo.repository.EventMergeRecordRepository;
import com.example.demo.service.EventMergeService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class EventMergeServiceImpl implements EventMergeService {

    private final EventMergeRecordRepository repository;

    public EventMergeServiceImpl(EventMergeRecordRepository repository) {
        this.repository = repository;
    }

    public EventMergeRecord mergeEvents(List<Long> eventIds, String reason) {
        EventMergeRecord record = new EventMergeRecord();
        record.setSourceEventIds(eventIds.toString());
        record.setMergeReason(reason);
        return repository.save(record);
    }

    public List<EventMergeRecord> getAllMergeRecords() {
        return repository.findAll();
    }

    public EventMergeRecord getMergeRecordById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Merge record not found"));
    }

    public List<EventMergeRecord> getMergeRecordsByDate(LocalDate start, LocalDate end) {
        return repository.findAll();
    }
}
