package com.example.demo.service.impl;

import com.example.demo.entity.ClashRecord;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.ClashRecordRepository;
import com.example.demo.service.ClashRecordService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClashRecordServiceImpl implements ClashRecordService {
    private final ClashRecordRepository clashRecordRepository;

    public ClashRecordServiceImpl(ClashRecordRepository clashRecordRepository) {
        this.clashRecordRepository = clashRecordRepository;
    }

    @Override
    public ClashRecord createClashRecord(ClashRecord clashRecord) {
        return clashRecordRepository.save(clashRecord);
    }

    @Override
    public List<ClashRecord> getAllClashRecords() {
        return clashRecordRepository.findAll();
    }

    @Override
    public ClashRecord getClashRecordById(Long id) {
        return clashRecordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Clash record not found"));
    }

    @Override
    public void deleteClashRecord(Long id) {
        clashRecordRepository.deleteById(id);
    }
}