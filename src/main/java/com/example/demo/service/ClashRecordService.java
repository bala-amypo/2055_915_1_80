package com.example.demo.service;

import com.example.demo.entity.ClashRecord;
import java.util.List;

public interface ClashRecordService {
    ClashRecord createClashRecord(ClashRecord clashRecord);
    List<ClashRecord> getAllClashRecords();
    ClashRecord getClashRecordById(Long id);
    void deleteClashRecord(Long id);
}
