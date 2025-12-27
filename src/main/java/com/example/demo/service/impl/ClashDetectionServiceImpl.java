package com.example.demo.service.impl;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashDetectionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClashDetectionServiceImpl implements ClashDetectionService {

    @Override
    public List<ClashRecord> getClashesForEvent(long eventId) {
        return List.of();
    }

    @Override
    public List<ClashRecord> getUnresolvedClashes() {
        return List.of();
    }

    @Override
    public ClashRecord resolveClash(long clashId) {
        ClashRecord cr = new ClashRecord();
        cr.setResolved(true);
        return cr;
    }
}
