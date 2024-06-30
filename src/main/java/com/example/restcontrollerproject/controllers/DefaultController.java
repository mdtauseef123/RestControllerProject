package com.example.restcontrollerproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/code/logyx")
public class DefaultController {

    @GetMapping("")
    public String getDefaultPage(){
        return "Hello World! Rest Controller Project";
    }
}
