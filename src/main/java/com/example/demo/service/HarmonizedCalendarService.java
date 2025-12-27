package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import com.example.demo.entity.HarmonizedCalendar;

public interface HarmonizedCalendarService {

    List<HarmonizedCalendar> generate();

    HarmonizedCalendar getById(Long id);

    List<HarmonizedCalendar> getAll();

    List<HarmonizedCalendar> getByRange(LocalDate start, LocalDate end);
}
