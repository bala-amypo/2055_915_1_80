package com.example.demo.controller;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clash-records")
public class ClashRecordController {
    private final ClashRecordService clashRecordService;

    public ClashRecordController(ClashRecordService clashRecordService) {
        this.clashRecordService = clashRecordService;
    }

    @PostMapping
    public ResponseEntity<ClashRecord> createClashRecord(@RequestBody ClashRecord clashRecord) {
        return ResponseEntity.ok(clashRecordService.createClashRecord(clashRecord));
    }

    @GetMapping
    public ResponseEntity<List<ClashRecord>> getAllClashRecords() {
        return ResponseEntity.ok(clashRecordService.getAllClashRecords());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClashRecord> getClashRecordById(@PathVariable Long id) {
        return ResponseEntity.ok(clashRecordService.getClashRecordById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClashRecord(@PathVariable Long id) {
        clashRecordService.deleteClashRecord(id);
        return ResponseEntity.noContent().build();
    }
}