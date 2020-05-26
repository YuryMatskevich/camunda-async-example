package org.example.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SyncService implements CustomService {

    private RuntimeService runtimeService;

    @Autowired
    public SyncService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public void startProcess(String key) {
        runtimeService.startProcessInstanceByKey(key);
    }
}
