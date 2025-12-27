package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import com.example.demo.entity.EventMergeRecord;

public interface EventMergeService {

    EventMergeRecord merge(List<Long> eventIds);

    EventMergeRecord getById(Long id);

    List<EventMergeRecord> getAll();

    List<EventMergeRecord> getByRange(LocalDate start, LocalDate end);
}
