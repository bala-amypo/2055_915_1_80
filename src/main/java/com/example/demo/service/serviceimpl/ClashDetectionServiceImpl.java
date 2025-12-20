package com.example.demo.serviceimpl;

import com.example.demo.entity.ClashRecord;
import com.example.demo.repository.ClashRecordRepository;
import com.example.demo.service.ClashDetectionService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClashDetectionServiceImpl implements ClashDetectionService {

    private final ClashRecordRepository repository;

    public ClashDetectionServiceImpl(ClashRecordRepository repository) {
        this.repository = repository;
    }

    public ClashRecord logClash(ClashRecord clash) {
        return repository.save(clash);
    }

    public List<ClashRecord> getClashesForEvent(Long eventId) {
        return repository.findAll();
    }

    public void resolveClash(Long clashId) {
        ClashRecord clash = repository.findById(clashId)
                .orElseThrow(() -> new ResourceNotFoundException("Clash not found"));
        clash.setResolved(true);
        repository.save(clash);
    }

    public List<ClashRecord> getUnresolvedClashes() {
        return repository.findAll().stream()
                .filter(c -> !c.getResolved())
                .toList();
    }

    public List<ClashRecord> getAllClashes() {
        return repository.findAll();
    }
}
