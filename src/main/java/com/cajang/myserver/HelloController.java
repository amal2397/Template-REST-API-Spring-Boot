package com.cajang.myserver;

import org.springframework.web.bind.annotation.*;

import com.cajang.myserver.Student.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;

@RestController
@RequestMapping(path = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getStudent")
    public List getStudent(){
        return studentService.getStudents();
    }


    @GetMapping("/users")
    public String getUsers() {
        return "Menampilkan Seluurh data user";
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
