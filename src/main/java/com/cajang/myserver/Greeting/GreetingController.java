package com.cajang.myserver.Greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/greeting")
public class GreetingController {

    @GetMapping("")
    public Greeting getGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        String message = String.format("Hello %s!", name);
        // String msg = "Hello " + name;
        Greeting greeting = new Greeting(1, message);
        System.out.println("Oke");

        return greeting;
    }

    @PostMapping("")
    public String postGreeting(@RequestBody Greeting greeting) {
        // String msg = String.format("Hello %s", name);
        return greeting.getContent();
    }
}
