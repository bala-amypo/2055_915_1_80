package com.example.demo.service.impl;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashRecordService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClashRecordServiceImpl implements ClashRecordService {

    @Override
    public ClashRecord createClash(ClashRecord record) {
        return record;
    }

    @Override
    public List<ClashRecord> getAllClashes() {
        return new ArrayList<>();
    }
}
