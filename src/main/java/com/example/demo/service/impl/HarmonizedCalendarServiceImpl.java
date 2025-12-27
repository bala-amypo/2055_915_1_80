package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.repository.HarmonizedCalendarRepository;
import com.example.demo.service.HarmonizedCalendarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class HarmonizedCalendarServiceImpl implements HarmonizedCalendarService {

    private final AcademicEventRepository eventRepo;
    private final HarmonizedCalendarRepository calendarRepo;

    public HarmonizedCalendarServiceImpl(AcademicEventRepository eventRepo,
                                         HarmonizedCalendarRepository calendarRepo) {
        this.eventRepo = eventRepo;
        this.calendarRepo = calendarRepo;
    }

    @Override
    public List<HarmonizedCalendar> generate() {
        List<AcademicEvent> events = eventRepo.findAll();
        List<HarmonizedCalendar> result = new ArrayList<>();
        String groupId = UUID.randomUUID().toString();
        for (AcademicEvent e : events) {
            result.add(calendarRepo.save(
                    new HarmonizedCalendar(
                            e.getTitle(),
                            e.getStartDate(),
                            e.getEndDate(),
                            groupId
                    )
            ));
        }
        return result;
    }
}
