package com.example.demo.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.EventMergeRecord;
import com.example.demo.service.EventMergeService;

@Service
public class EventMergeServiceImpl implements EventMergeService {

    @Override
    public EventMergeRecord merge(List<Long> eventIds) {
        return null;
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
