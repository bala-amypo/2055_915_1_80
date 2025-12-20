package com.example.demo.controller;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clashes")
public class ClashRecordController {

    private final ClashRecordService clashRecordService;

    public ClashRecordController(ClashRecordService clashRecordService) {
        this.clashRecordService = clashRecordService;
    }

    @GetMapping
    public List<ClashRecord> getAll() {
        return clashRecordService.getAll();
    }

    @PostMapping
    public ClashRecord save(@RequestBody ClashRecord clash) {
        return clashRecordService.save(clash);
    }

    @PutMapping("/{id}/resolve")
    public void resolve(@PathVariable Long id) {
        clashRecordService.resolve(id);
    }
}
