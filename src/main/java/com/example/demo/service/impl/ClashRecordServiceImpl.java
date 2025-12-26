package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashRecordService;

@Service
public class ClashRecordServiceImpl implements ClashRecordService {

    @Override
    public ClashRecord createClash(ClashRecord record) {
        return record;
    }
}
