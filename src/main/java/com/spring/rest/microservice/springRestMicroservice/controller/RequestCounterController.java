package com.spring.rest.microservice.springRestMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestCounterController {
    private int counter;

    @GetMapping ("/requests")
    public int getRequests() {
        return counter++;
    }
}
