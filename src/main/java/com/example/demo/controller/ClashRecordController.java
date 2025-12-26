package com.example.demo.controller;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashRecordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clashes")
public class ClashRecordController {

    private final ClashRecordService service;

    public ClashRecordController(ClashRecordService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ClashRecord> create(@RequestBody ClashRecord clash) {
        return new ResponseEntity<>(service.createClash(clash), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ClashRecord>> getAll() {
        return ResponseEntity.ok(service.getAllClashes());
    }
}
