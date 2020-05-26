package org.example.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService implements CustomService {

    private RuntimeService runtimeService;

    @Autowired
    public AsyncService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @Async
    public void startProcess(String key) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            //
        }
        runtimeService.startProcessInstanceByKey(key);
    }
}
