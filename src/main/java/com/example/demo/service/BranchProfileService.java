package com.example.demo.service;

import com.example.demo.entity.BranchProfile;
import java.util.List;

public interface BranchProfileService {
    BranchProfile createBranch(BranchProfile branch);
    void updateBranchStatus(Long id, boolean active);
    List<BranchProfile> getAllBranches();
    BranchProfile getBranchById(Long id);
    BranchProfile findByBranchCode(String branchCode);
}
