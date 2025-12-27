package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.ClashRecord;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.repository.ClashRecordRepository;
import com.example.demo.service.ClashDetectionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClashDetectionServiceImpl implements ClashDetectionService {

    private final AcademicEventRepository eventRepo;
    private final ClashRecordRepository clashRepo;

    public ClashDetectionServiceImpl(AcademicEventRepository eventRepo,
                                     ClashRecordRepository clashRepo) {
        this.eventRepo = eventRepo;
        this.clashRepo = clashRepo;
    }

    @Override
    public void detectClashes() {
        List<AcademicEvent> events = eventRepo.findAll();
        for (int i = 0; i < events.size(); i++) {
            for (int j = i + 1; j < events.size(); j++) {
                AcademicEvent a = events.get(i);
                AcademicEvent b = events.get(j);
                if (!a.getEndDate().isBefore(b.getStartDate())
                        && !b.getEndDate().isBefore(a.getStartDate())) {
                    clashRepo.save(new ClashRecord(a, b, "HIGH"));
                }
            }
        }
    }
}
