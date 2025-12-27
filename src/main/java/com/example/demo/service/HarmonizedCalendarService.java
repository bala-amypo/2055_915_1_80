package com.example.demo.service;

import com.example.demo.entity.HarmonizedCalendar;
import java.time.LocalDate;
import java.util.List;

public interface HarmonizedCalendarService {
    HarmonizedCalendar generateHarmonizedCalendar(String name, String generatedBy);
    List<HarmonizedCalendar> getCalendarsWithinRange(LocalDate from, LocalDate to);
}
