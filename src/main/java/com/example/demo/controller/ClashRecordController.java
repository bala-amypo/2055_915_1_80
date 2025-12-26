package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashRecordService;

@RestController
@RequestMapping("/clashes")
public class ClashRecordController {

    @Autowired
    private ClashRecordService service;

    @PostMapping
    public ClashRecord createClash(@RequestBody ClashRecord record) {
        return service.createClash(record);
    }
}
