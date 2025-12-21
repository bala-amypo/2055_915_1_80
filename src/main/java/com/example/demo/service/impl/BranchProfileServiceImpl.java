package com.example.demo.service.impl;

import com.example.demo.entity.BranchProfile;
import com.example.demo.repository.BranchProfileRepository;
import com.example.demo.service.BranchProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchProfileServiceImpl implements BranchProfileService {

    @Autowired
    private BranchProfileRepository repository;

    @Override
    public BranchProfile createBranch(BranchProfile branch) {
        return repository.save(branch);
    }

    @Override
    public List<BranchProfile> getAllBranches() {
        return repository.findAll();
    }

    @Override
    public BranchProfile updateBranchStatus(Long branchId, boolean active) {
        BranchProfile branch = repository.findById(branchId)
                .orElseThrow(() -> new RuntimeException("Branch not found"));
        branch.setActive(active);
        return repository.save(branch);
    }

    @Override
    public BranchProfile getBranchById(Long branchId) {
        return repository.findById(branchId)
                .orElseThrow(() -> new RuntimeException("Branch not found"));
    }

    @Override
    public BranchProfile findByBranchCode(String branchCode) {
        return repository.findByBranchCode(branchCode)
                .orElseThrow(() -> new RuntimeException("Branch not found"));
    }
}
