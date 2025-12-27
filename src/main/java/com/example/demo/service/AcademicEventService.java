package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.AcademicEvent;

public interface AcademicEventService {

    AcademicEvent create(AcademicEvent event);

    AcademicEvent update(Long id, AcademicEvent event);

    List<AcademicEvent> getByBranch(Long branchId);

    AcademicEvent getById(Long id);

    List<AcademicEvent> getAll();
}
