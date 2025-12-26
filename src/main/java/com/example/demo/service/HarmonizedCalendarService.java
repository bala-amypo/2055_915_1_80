package com.example.demo.service;

import com.example.demo.entity.HarmonizedCalendar;
import java.util.List;

public interface HarmonizedCalendarService {
    HarmonizedCalendar createCalendar(HarmonizedCalendar calendar);
    List<HarmonizedCalendar> getAllCalendars();
}
