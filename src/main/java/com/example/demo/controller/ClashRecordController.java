package com.example.demo.controller;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashDetectionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clashes")
@Tag(name = "Clash Records")
public class ClashRecordController {

    private final ClashDetectionService service;

    public ClashRecordController(ClashDetectionService service) {
        this.service = service;
    }

    @PostMapping
    public ClashRecord log(@RequestBody ClashRecord clash) {
        return service.logClash(clash);
    }

    @PutMapping("/{id}/resolve")
    public ClashRecord resolve(@PathVariable Long id) {
        return service.resolveClash(id);
    }

    @GetMapping("/event/{eventId}")
    public List<ClashRecord> getByEvent(@PathVariable Long eventId) {
        return service.getClashesForEvent(eventId);
    }

    @GetMapping("/unresolved")
    public List<ClashRecord> unresolved() {
        return service.getUnresolvedClashes();
    }

    @GetMapping
    public List<ClashRecord> getAll() {
        return service.getAllClashes();
    }
}
