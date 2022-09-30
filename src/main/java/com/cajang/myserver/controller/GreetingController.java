package com.cajang.myserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cajang.Greeting;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    private static final String template = "Hello %s!";

    @GetMapping("")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") String name ){

        String msg = String.format(template, name);
        return new Greeting(1, msg);

    }
    
}
