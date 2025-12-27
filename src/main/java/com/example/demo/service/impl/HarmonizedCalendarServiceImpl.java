package com.example.demo.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.service.HarmonizedCalendarService;

@Service
public class HarmonizedCalendarServiceImpl implements HarmonizedCalendarService {

    @Override
    public List<HarmonizedCalendar> generate() {
        return List.of();
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
