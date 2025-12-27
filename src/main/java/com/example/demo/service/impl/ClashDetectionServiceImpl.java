package com.example.demo.service.impl;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashDetectionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClashDetectionServiceImpl implements ClashDetectionService {

    @Override
    public ClashRecord log(ClashRecord record) {
        return record;
    }

    @Override
    public ClashRecord resolve(Long id) {
        ClashRecord cr = new ClashRecord();
        cr.setResolved(true);
        return cr;
    }

    @Override
    public List<ClashRecord> getByEvent(Long eventId) {
        return List.of();
    }

    @Override
    public List<ClashRecord> getUnresolved() {
        return List.of();
    }

    @Override
    public List<ClashRecord> getAll() {
        return List.of();
    }
}
