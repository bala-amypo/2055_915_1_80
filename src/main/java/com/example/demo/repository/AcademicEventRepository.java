package com.example.demo.repository;

import com.example.demo.entity.AcademicEvent;
import com.example.demo.entity.BranchProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AcademicEventRepository extends JpaRepository<AcademicEvent, Long> {

    List<AcademicEvent> findByBranch(BranchProfile branch);

    List<AcademicEvent> findByStartDateLessThanEqualAndEndDateGreaterThanEqual(
            LocalDate endDate, LocalDate startDate
    );
}
