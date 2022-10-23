package com.bianca.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {

    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping("/")
    public String helloWorld(){
        return welcomeMessage;
    }


}
