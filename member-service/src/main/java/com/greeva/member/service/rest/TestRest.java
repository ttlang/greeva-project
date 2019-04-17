package com.greeva.member.service.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @GetMapping(value = "/test")
    public ResponseEntity<?> testMethod() {
        return ResponseEntity.ok("test");
    }

}
