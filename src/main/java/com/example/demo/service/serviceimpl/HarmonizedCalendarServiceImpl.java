package com.example.demo.serviceimpl;

import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.repository.HarmonizedCalendarRepository;
import com.example.demo.service.HarmonizedCalendarService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class HarmonizedCalendarServiceImpl implements HarmonizedCalendarService {

    private final HarmonizedCalendarRepository repository;

    public HarmonizedCalendarServiceImpl(HarmonizedCalendarRepository repository) {
        this.repository = repository;
    }

    public HarmonizedCalendar generateHarmonizedCalendar(String title, String generatedBy) {
        HarmonizedCalendar calendar = new HarmonizedCalendar();
        calendar.setTitle(title);
        calendar.setGeneratedBy(generatedBy);
        return repository.save(calendar);
    }

    public HarmonizedCalendar getCalendarById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Calendar not found"));
    }

    public List<HarmonizedCalendar> getAllCalendars() {
        return repository.findAll();
    }

    public List<HarmonizedCalendar> getCalendarsWithinRange(LocalDate start, LocalDate end) {
        return repository.findAll();
    }
}
