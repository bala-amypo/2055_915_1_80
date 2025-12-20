package com.example.demo.controller;

import com.example.demo.dto.MergeEventRequest;
import com.example.demo.entity.EventMergeRecord;
import com.example.demo.service.EventMergeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/merge-records")
@Tag(name = "Event Merge Records")
public class EventMergeRecordController {

    private final EventMergeService service;

    public EventMergeRecordController(EventMergeService service) {
        this.service = service;
    }

    @PostMapping
    public EventMergeRecord merge(@RequestBody MergeEventRequest request) {
        return service.mergeEvents(request.getEventIds(), request.getReason());
    }

    @GetMapping("/{id}")
    public EventMergeRecord getById(@PathVariable Long id) {
        return service.getMergeRecordById(id);
    }

    @GetMapping
    public List<EventMergeRecord> getAll() {
        return service.getAllMergeRecords();
    }

    @GetMapping("/range")
    public List<EventMergeRecord> getByRange(
            @RequestParam LocalDate start,
            @RequestParam LocalDate end) {
        return service.getMergeRecordsByDate(start, end);
    }
}
