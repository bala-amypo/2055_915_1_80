package com.example.demo.service;

import com.example.demo.entity.BranchProfile;

import java.util.List;

public interface BranchProfileService {

    BranchProfile createBranch(BranchProfile branch);

    List<BranchProfile> getAllBranches();

    BranchProfile updateBranchStatus(Long branchId, boolean active);

    BranchProfile getBranchById(Long branchId);

    BranchProfile findByBranchCode(String branchCode);
}
