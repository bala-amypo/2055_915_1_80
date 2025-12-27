package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ClashRecord;

public interface ClashDetectionService {

    ClashRecord log(ClashRecord clash);

    ClashRecord resolve(Long id);

    List<ClashRecord> getByEvent(Long eventId);

    List<ClashRecord> getUnresolved();

    List<ClashRecord> getAll();
}
