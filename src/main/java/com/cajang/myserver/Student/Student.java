package com.cajang.myserver.student;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int age;
}
