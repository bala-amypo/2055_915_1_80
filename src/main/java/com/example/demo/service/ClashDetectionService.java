package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.ClashRecord;

public interface ClashDetectionService {
    List<ClashRecord> detectClashes(List<AcademicEvent> events);
}
