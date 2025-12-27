package com.example.demo.service;

import com.example.demo.entity.EventMergeRecord;
import java.time.LocalDate;
import java.util.List;

public interface EventMergeService {

    EventMergeRecord merge(List<Long> eventIds);

    EventMergeRecord getById(Long id);

    List<EventMergeRecord> getAll();

    List<EventMergeRecord> getByRange(LocalDate start, LocalDate end);
}
