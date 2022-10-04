package com.cajang.myserver.student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean 
    CommandLineRunner addStudentToDatabase(StudentRepository repository){
        return args -> {
            Student amal = new Student(1L, "Ichlasul Amal", "amal@mitrasolsui.group", LocalDate.of(1999, Month.AUGUST, 26), 23);
            repository.save(amal);
        };
    }
}
