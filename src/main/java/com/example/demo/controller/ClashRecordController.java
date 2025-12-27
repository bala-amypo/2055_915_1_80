package com.example.demo.controller;

import com.example.demo.entity.ClashRecord;
import com.example.demo.repository.ClashRecordRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clashes")
public class ClashRecordController {

    private final ClashRecordRepository repository;

    public ClashRecordController(ClashRecordRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ClashRecord> all() {
        return repository.findAll();
    }
}
