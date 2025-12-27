package com.example.demo.controller;

import com.example.demo.entity.BranchProfile;
import com.example.demo.service.BranchProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/branches")
public class BranchProfileController {

    private final BranchProfileService service;

    public BranchProfileController(BranchProfileService service) {
        this.service = service;
    }

    @PostMapping
    public BranchProfile create(@RequestParam String branchCode,
                                @RequestParam String branchName,
                                @RequestParam Long userId) {
        return service.createBranch(branchCode, branchName, userId);
    }
}
