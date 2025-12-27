package com.example.demo.controller;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.service.AcademicEventService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/events")
public class AcademicEventController {

    private final AcademicEventService service;

    public AcademicEventController(AcademicEventService service) {
        this.service = service;
    }

    @PostMapping
    public AcademicEvent create(@RequestParam Long branchId,
                                @RequestParam String title,
                                @RequestParam LocalDate startDate,
                                @RequestParam LocalDate endDate) {
        return service.createEvent(branchId, title, startDate, endDate);
    }

    @GetMapping("/branch/{branchId}")
    public List<AcademicEvent> byBranch(@PathVariable Long branchId) {
        return service.getEventsByBranch(branchId);
    }
}
