package com.example.demo.service.serviceimpl;

import com.example.demo.entity.ClashRecord;
import com.example.demo.repository.ClashRecordRepository;
import com.example.demo.service.ClashRecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClashRecordServiceImpl implements ClashRecordService {

    private final ClashRecordRepository repository;

    public ClashRecordServiceImpl(ClashRecordRepository repository) {
        this.repository = repository;
    }

    public ClashRecord save(ClashRecord clash) {
        return repository.save(clash);
    }

    public void resolve(Long id) {
        ClashRecord record = repository.findById(id).orElseThrow();
        record.setResolved(true);
        repository.save(record);
    }

    public List<ClashRecord> getAll() {
        return repository.findAll();
    }
}
