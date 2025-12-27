package com.example.demo.controller;

import com.example.demo.entity.BranchProfile;
import com.example.demo.service.BranchProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branches")
@Tag(name = "Branch Profiles")
public class BranchProfileController {

    private final BranchProfileService service;

    public BranchProfileController(BranchProfileService service) {
        this.service = service;
    }

    @PostMapping
    public BranchProfile create(@RequestBody BranchProfile branch) {
        return service.create(branch);
    }

    @PutMapping("/{id}/status")
    public BranchProfile updateStatus(@PathVariable Long id, @RequestParam boolean active) {
        return service.updateStatus(id, active);
    }

    @GetMapping("/{id}")
    public BranchProfile getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<BranchProfile> getAll() {
        return service.getAll();
    }

    @GetMapping("/lookup/{branchCode}")
    public BranchProfile getByCode(@PathVariable String branchCode) {
        return service.getByCode(branchCode);
    }
}
