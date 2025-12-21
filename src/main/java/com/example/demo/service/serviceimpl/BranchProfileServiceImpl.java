package com.example.demo.serviceimpl;

import com.example.demo.entity.BranchProfile;
import com.example.demo.repository.BranchProfileRepository;
import com.example.demo.service.BranchProfileService;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BranchProfileServiceImpl implements BranchProfileService {

    private final BranchProfileRepository repository;

    public BranchProfileServiceImpl(BranchProfileRepository repository) {
        this.repository = repository;
    }

    public BranchProfile createBranch(BranchProfile branch) {
        return repository.save(branch);
    }

    public void updateBranchStatus(Long id, boolean active) {
        BranchProfile branch = getBranchById(id);
        branch.setActive(active);
        repository.save(branch);
    }

    public List<BranchProfile> getAllBranches() {
        return repository.findAll();
    }

    public BranchProfile getBranchById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Branch not found"));
    }

    public BranchProfile findByBranchCode(String branchCode) {
        return repository.findAll().stream()
                .filter(b -> b.getBranchCode().equals(branchCode))
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Branch not found"));
    }
}
