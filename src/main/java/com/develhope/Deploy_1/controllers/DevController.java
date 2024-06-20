package com.develhope.Deploy_1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevController {

    @Value("${app.devName}")
    private String devName;

    @GetMapping("/devname")
    public String getDevName() {
        return devName;
    }
}

