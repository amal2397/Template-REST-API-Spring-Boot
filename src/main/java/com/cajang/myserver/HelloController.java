package com.cajang.myserver;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

@RestController
@RequestMapping(path = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    @GetMapping("/users")
    public int getUsers() {
        return 1;
    }

    @GetMapping("/users/{id}")
    public int getUser(@PathVariable int id) {
        return id;
    }

    @GetMapping("user")
    public String getUserByParam(@RequestParam String name){
        return name;
    }

    @PostMapping("/message")
	public int addMessage(@RequestBody Email email) {
        System.out.println("Sender : ");
        System.out.println(email.getSenderName());
		return 0;
	}



}
