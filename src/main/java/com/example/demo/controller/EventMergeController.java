package com.example.demo.controller;

import com.example.demo.entity.EventMergeRecord;
import com.example.demo.service.EventMergeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/event-merge")
public class EventMergeController {
    private final EventMergeService service;

    public EventMergeController(EventMergeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EventMergeRecord> mergeEvent(@RequestBody EventMergeRecord eventMergeRecord) {
        return ResponseEntity.ok(service.mergeEvent(eventMergeRecord));
    }

    @GetMapping
    public ResponseEntity<List<EventMergeRecord>> getAllMergedEvents() {
        return ResponseEntity.ok(service.getAllMergedEvents());
    }
}