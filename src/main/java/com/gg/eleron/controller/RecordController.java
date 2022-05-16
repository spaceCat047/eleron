package com.gg.eleron.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class RecordController {

//    @PostMapping(path = "/test")
    String testEndpoint() {
        System.out.println("I'm working");

        return "success";
    }
}
