package com.example.demo.service;

import com.example.demo.entity.AcademicEvent;
import java.util.List;

public interface AcademicEventService {

    AcademicEvent create(AcademicEvent event);

    AcademicEvent update(Long id, AcademicEvent event);

    List<AcademicEvent> getByBranch(Long branchId);

    AcademicEvent getById(Long id);

    List<AcademicEvent> getAll();
}
