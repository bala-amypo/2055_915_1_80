package com.example.demo.service;

import com.example.demo.entity.ClashRecord;
import java.util.List;

public interface ClashDetectionService {

    ClashRecord log(ClashRecord record);

    ClashRecord resolve(Long id);

    List<ClashRecord> getByEvent(Long eventId);

    List<ClashRecord> getUnresolved();

    List<ClashRecord> getAll();
}
