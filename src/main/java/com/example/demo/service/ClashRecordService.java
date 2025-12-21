package com.example.demo.service;

import com.example.demo.entity.ClashRecord;
import java.util.List;

public interface ClashRecordService {

    ClashRecord save(ClashRecord clash);

    void resolve(Long id);

    List<ClashRecord> getAll();
}
