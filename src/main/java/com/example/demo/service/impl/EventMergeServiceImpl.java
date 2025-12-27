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
    public EventMergeRecord mergeEvents(List<Long> ids, String reason) {
        return new EventMergeRecord(
                1L,
                ids.toString(),
                "Merged Event",
                LocalDate.now(),
                LocalDate.now(),
                reason,
                LocalDateTime.now()
        );
    }

    @Override
    public List<EventMergeRecord> getMergeRecordsByDate(LocalDate start, LocalDate end) {
        return List.of();
    }
}
