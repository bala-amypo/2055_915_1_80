package com.example.demo.controller;

import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.service.HarmonizedCalendarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/harmonized-calendar")
public class HarmonizedCalendarController {
    private final HarmonizedCalendarService service;

    public HarmonizedCalendarController(HarmonizedCalendarService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<HarmonizedCalendar> createCalendar(@RequestBody HarmonizedCalendar calendar) {
        return ResponseEntity.ok(service.createCalendar(calendar));
    }

    @GetMapping
    public ResponseEntity<List<HarmonizedCalendar>> getAllCalendars() {
        return ResponseEntity.ok(service.getAllCalendars());
    }
}