package com.eazybytes.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

    //http://localhost:8080/welcome
    @GetMapping
    public String welcome(){
        return "welcome to spring security";
    }
}
