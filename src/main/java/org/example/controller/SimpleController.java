package org.example.controller;

import org.example.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    private CustomService asyncService;
    private CustomService syncService;

    @Autowired
    public SimpleController(CustomService asyncService, CustomService syncService) {
        this.asyncService = asyncService;
        this.syncService = syncService;
    }

    @GetMapping(value = "/request")
    public ResponseEntity<String> sendQRequest() {
        syncService.startProcess("firstProcess");
        asyncService.startProcess("secondProcess");
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
