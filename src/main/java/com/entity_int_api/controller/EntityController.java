package com.entity_int_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EntityController {

    @GetMapping
    public String api(){
        return "Hello World!!!";
    }

    @GetMapping("/query/{name}")
    public ResponseEntity<String> getApi(@PathVariable String name) {
        return ResponseEntity.ok(name);
    }
}
