package com.cajang.myserver.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentServiceImplement studentServiceImplement;

    @Autowired
    public StudentController(StudentServiceImplement studentServiceImplement) {
        this.studentServiceImplement = studentServiceImplement;
    }


    


    /**
     * @return List Student
     */
    @GetMapping
    public List<Student> getStudent(){
        return studentServiceImplement.getAllStudent();
    }
}
