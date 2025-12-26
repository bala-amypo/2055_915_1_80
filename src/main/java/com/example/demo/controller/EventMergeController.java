package com.example.demo.controller;

import com.example.demo.entity.EventMergeRecord;
import com.example.demo.service.EventMergeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event-merges")
public class EventMergeController {

    private final EventMergeService service;

    public EventMergeController(EventMergeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<EventMergeRecord> create(@RequestBody EventMergeRecord record) {
        return new ResponseEntity<>(service.mergeEvent(record), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EventMergeRecord>> getAll() {
        return ResponseEntity.ok(service.getAllMergedEvents());
    }
}
