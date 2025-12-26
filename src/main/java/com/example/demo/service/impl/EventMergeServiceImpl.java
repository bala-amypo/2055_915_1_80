@Override
public EventMergeRecord mergeEvent(EventMergeRecord eventMergeRecord) {
    return eventMergeRecordRepository.save(eventMergeRecord);
}

@Override
public List<EventMergeRecord> getAllMergedEvents() {
    return getAllMergeRecords();
}
