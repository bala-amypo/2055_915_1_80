package com.example.demo.service.impl;

import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.service.HarmonizedCalendarService;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class HarmonizedCalendarServiceImpl implements HarmonizedCalendarService {

    @Override
    public HarmonizedCalendar generateHarmonizedCalendar(String name, String generatedBy) {
        return new HarmonizedCalendar(
                1L,
                name,
                generatedBy,
                LocalDateTime.now(),
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                "{}"
        );
    }

    @Override
    public List<HarmonizedCalendar> getCalendarsWithinRange(LocalDate from, LocalDate to) {
        return List.of();
    }
}
