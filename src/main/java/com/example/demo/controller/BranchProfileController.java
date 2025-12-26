package com.example.demo.controller;

import com.example.demo.entity.BranchProfile;
import com.example.demo.service.BranchProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchProfileController {

    private final BranchProfileService service;

    public BranchProfileController(BranchProfileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<BranchProfile> create(@RequestBody BranchProfile branch) {
        return new ResponseEntity<>(service.createBranch(branch), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<BranchProfile>> getAll() {
        return ResponseEntity.ok(service.getAllBranches());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BranchProfile> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getBranchById(id));
    }
}
