package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashDetectionService;

@Service
public class ClashDetectionServiceImpl implements ClashDetectionService {

    @Override
    public ClashRecord detectClash(ClashRecord record) {
        record.setSeverity("LOW");
        return record;
    }
}
