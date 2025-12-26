package com.example.demo.service.impl;

import com.example.demo.entity.EventMergeRecord;
import com.example.demo.service.EventMergeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventMergeServiceImpl implements EventMergeService {

    @Override
    public EventMergeRecord mergeEvent(EventMergeRecord record) {
        return record;
    }

    @Override
    public List<EventMergeRecord> getAllMergedEvents() {
        return new ArrayList<>();
    }
}
