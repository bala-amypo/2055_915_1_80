package com.example.demo.service.impl;

import com.example.demo.entity.EventMergeRecord;
import com.example.demo.service.EventMergeService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventMergeServiceImpl implements EventMergeService {

    @Override
    public EventMergeRecord merge(List<Long> eventIds) {
        return new EventMergeRecord(
                1L,
                eventIds.toString(),
                "Merged Event",
                LocalDate.now(),
                LocalDate.now(),
                "AUTO",
                LocalDateTime.now()
        );
    }

    @Override
    public EventMergeRecord getById(Long id) {
        return null;
    }

    @Override
    public List<EventMergeRecord> getAll() {
        return List.of();
    }

    @Override
    public List<EventMergeRecord> getByRange(LocalDate start, LocalDate end) {
        return List.of();
    }
}
