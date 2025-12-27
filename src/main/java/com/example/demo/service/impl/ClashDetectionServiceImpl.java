package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.ClashRecord;
import com.example.demo.service.ClashDetectionService;

@Service
public class ClashDetectionServiceImpl implements ClashDetectionService {

    @Override
    public ClashRecord log(ClashRecord clash) {
        return clash;
    }

    @Override
    public ClashRecord resolve(Long id) {
        return null;
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
