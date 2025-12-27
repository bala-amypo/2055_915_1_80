package com.example.demo.service.impl;

import com.example.demo.entity.BranchProfile;
import com.example.demo.entity.UserAccount;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.exception.ValidationException;
import com.example.demo.repository.BranchProfileRepository;
import com.example.demo.repository.UserAccountRepository;
import com.example.demo.service.BranchProfileService;
import org.springframework.stereotype.Service;

@Service
public class BranchProfileServiceImpl implements BranchProfileService {

    private final BranchProfileRepository branchRepo;
    private final UserAccountRepository userRepo;

    public BranchProfileServiceImpl(BranchProfileRepository branchRepo, UserAccountRepository userRepo) {
        this.branchRepo = branchRepo;
        this.userRepo = userRepo;
    }

    @Override
    public BranchProfile createBranch(String branchCode, String branchName, Long userId) {
        if (branchRepo.existsByBranchCode(branchCode)) {
            throw new ValidationException("Branch code already exists");
        }
        UserAccount user = userRepo.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        return branchRepo.save(new BranchProfile(branchCode, branchName, user));
    }
}
