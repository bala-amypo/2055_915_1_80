package com.example.demo.service;

import com.example.demo.entity.EventMergeRecord;
import java.util.List;

public interface EventMergeService {
    EventMergeRecord mergeEvent(EventMergeRecord record);
    List<EventMergeRecord> getAllMergedEvents();
}
