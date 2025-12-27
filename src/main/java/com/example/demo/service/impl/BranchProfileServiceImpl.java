package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BranchProfile;
import com.example.demo.service.BranchProfileService;

@Service
public class BranchProfileServiceImpl implements BranchProfileService {

    private final List<BranchProfile> store = new ArrayList<>();

    // 🔴 REQUIRED NAME BY TEST
    public BranchProfile createBranch(BranchProfile branch) {
        store.add(branch);
        return branch;
    }

    // 🔴 REQUIRED NAME BY TEST
    public BranchProfile updateBranchStatus(long id, boolean active) {
        for (BranchProfile b : store) {
            if (b.getId() != null && b.getId() == id) {
                b.setActive(active);
                return b;
            }
        }
        return null;
    }

    @Override
    public BranchProfile create(BranchProfile branch) {
        return createBranch(branch);
    }

    @Override
    public BranchProfile updateStatus(Long id, boolean active) {
        return updateBranchStatus(id, active);
    }

    @Override
    public BranchProfile getById(Long id) {
        return store.stream()
                .filter(b -> b.getId() != null && b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<BranchProfile> getAll() {
        return store;
    }

    @Override
    public BranchProfile getByCode(String branchCode) {
        return store.stream()
                .filter(b -> branchCode.equals(b.getBranchCode()))
                .findFirst()
                .orElse(null);
    }
}
