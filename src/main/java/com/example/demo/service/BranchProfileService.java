package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.BranchProfile;

public interface BranchProfileService {

    BranchProfile create(BranchProfile branch);

    BranchProfile updateStatus(Long id, boolean active);

    BranchProfile getById(Long id);

    List<BranchProfile> getAll();

    BranchProfile getByCode(String branchCode);
}
