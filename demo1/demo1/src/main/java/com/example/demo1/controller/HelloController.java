package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    @GetMapping("/")
    public String hrllo() {
        return "Hello World!";
    }
}
