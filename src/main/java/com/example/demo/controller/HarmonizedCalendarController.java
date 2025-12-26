package com.example.demo.controller;

import com.example.demo.entity.HarmonizedCalendar;
import com.example.demo.service.HarmonizedCalendarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/harmonized-calendars")
public class HarmonizedCalendarController {

    private final HarmonizedCalendarService service;

    public HarmonizedCalendarController(HarmonizedCalendarService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<HarmonizedCalendar> create(@RequestBody HarmonizedCalendar calendar) {
        return new ResponseEntity<>(service.createCalendar(calendar), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HarmonizedCalendar>> getAll() {
        return ResponseEntity.ok(service.getAllCalendars());
    }
}
