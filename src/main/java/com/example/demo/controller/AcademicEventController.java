package com.example.demo.controller;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.service.AcademicEventService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class AcademicEventController {
    private final AcademicEventService service;

    public AcademicEventController(AcademicEventService service) {
        this.service = service;
    }

    @PostMapping
    public AcademicEvent createEvent(@RequestBody AcademicEvent event) {
        return service.saveEvent(event);
    }

    @GetMapping
    public List<AcademicEvent> getAllEvents() {
        return service.getAllEvents();
    }
}
