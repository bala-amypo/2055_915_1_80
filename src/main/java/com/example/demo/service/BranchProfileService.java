package com.example.demo.service;

import com.example.demo.entity.BranchProfile;

public interface BranchProfileService {
    BranchProfile createBranch(String branchCode, String branchName, Long userId);
}
