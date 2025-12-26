package com.example.demo.controller;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.service.AcademicEventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/academic-events")
public class AcademicEventController {

    private final AcademicEventService service;

    public AcademicEventController(AcademicEventService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<AcademicEvent> create(@RequestBody AcademicEvent event) {
        return new ResponseEntity<>(service.createEvent(event), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<AcademicEvent>> getAll() {
        return ResponseEntity.ok(service.getAllEvents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AcademicEvent> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getEventById(id));
    }
}
