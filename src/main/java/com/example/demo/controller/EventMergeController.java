package com.example.demo.controller;

import com.example.demo.service.EventMergeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/merge")
public class EventMergeController {

    private final EventMergeService service;

    public EventMergeController(EventMergeService service) {
        this.service = service;
    }

    @PostMapping
    public void merge(@RequestParam Long eventId,
                      @RequestParam String mergedGroupId) {
        service.mergeEvents(eventId, mergedGroupId);
    }
}
