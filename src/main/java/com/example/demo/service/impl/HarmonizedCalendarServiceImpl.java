package com.example.demo.service.impl;

import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.service.HarmonizedCalendarService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HarmonizedCalendarServiceImpl implements HarmonizedCalendarService {

    @Override
    public HarmonizedCalendar createCalendar(HarmonizedCalendar calendar) {
        return calendar;
    }

    @Override
    public List<HarmonizedCalendar> getAllCalendars() {
        return new ArrayList<>();
    }
}
