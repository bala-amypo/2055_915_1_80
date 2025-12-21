package com.example.demo.service;

import com.example.demo.entity.BranchProfile;

public interface BranchProfileService {

    BranchProfile updateBranchStatus(Long branchId, boolean active);

    BranchProfile getBranchById(Long branchId);

    BranchProfile findByBranchCode(String branchCode);
}
