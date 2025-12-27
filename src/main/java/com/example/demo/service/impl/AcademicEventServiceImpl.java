package com.example.demo.service.impl;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.BranchProfile;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.ValidationException;
import com.example.demo.repository.AcademicEventRepository;
import com.example.demo.repository.BranchProfileRepository;
import com.example.demo.service.AcademicEventService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AcademicEventServiceImpl implements AcademicEventService {

    private final AcademicEventRepository eventRepo;
    private final BranchProfileRepository branchRepo;

    public AcademicEventServiceImpl(AcademicEventRepository eventRepo,
                                    BranchProfileRepository branchRepo) {
        this.eventRepo = eventRepo;
        this.branchRepo = branchRepo;
    }

    @Override
    public AcademicEvent createEvent(Long branchId, String title, LocalDate startDate, LocalDate endDate) {
        if (startDate.isAfter(endDate)) {
            throw new ValidationException("Invalid date range");
        }
        BranchProfile branch = branchRepo.findById(branchId)
                .orElseThrow(() -> new ResourceNotFoundException("Branch not found"));
        return eventRepo.save(new AcademicEvent(title, startDate, endDate, branch));
    }

    @Override
    public List<AcademicEvent> getEventsByBranch(Long branchId) {
        BranchProfile branch = branchRepo.findById(branchId)
                .orElseThrow(() -> new ResourceNotFoundException("Branch not found"));
        return eventRepo.findByBranch(branch);
    }
}
