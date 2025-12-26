package com.example.demo.service;

import com.example.demo.entity.ClashRecord;
import java.util.List;

public interface ClashRecordService {
    ClashRecord createClash(ClashRecord record);
    List<ClashRecord> getAllClashes();
}
