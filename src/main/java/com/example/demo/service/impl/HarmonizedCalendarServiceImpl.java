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
    public HarmonizedCalendar generate() {
        return new HarmonizedCalendar(
                1L,
                "Auto Calendar",
                "SYSTEM",
                LocalDateTime.now(),
                LocalDate.now(),
                LocalDate.now().plusDays(1),
                "{}"
        );
    }

    @Override
    public HarmonizedCalendar getById(Long id) {
        return null;
    }

    @Override
    public List<HarmonizedCalendar> getAll() {
        return List.of();
    }

    @Override
    public List<HarmonizedCalendar> getByRange(LocalDate start, LocalDate end) {
        return List.of();
    }
}
