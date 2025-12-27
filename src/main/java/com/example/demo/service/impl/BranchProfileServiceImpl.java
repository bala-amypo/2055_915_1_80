package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BranchProfile;
import com.example.demo.service.BranchProfileService;

@Service
public class BranchProfileServiceImpl implements BranchProfileService {

    @Override
    public BranchProfile create(BranchProfile branch) {
        return branch;
    }

    @Override
    public BranchProfile updateStatus(Long id, boolean active) {
        return null;
    }

    @Override
    public BranchProfile getById(Long id) {
        return null;
    }

    @Override
    public List<BranchProfile> getAll() {
        return List.of();
    }

    @Override
    public BranchProfile getByCode(String branchCode) {
        return null;
    }
}
