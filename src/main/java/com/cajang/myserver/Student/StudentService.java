package com.cajang.myserver.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents(){

        Student amal = new Student(
                "Ichlasul Amal",
                "ichlasul0899@gmail.com",
                LocalDate.of(1999, Month.AUGUST, 26)
            );

            Student ihdhar = new Student(
                "Rafif Ihdhar",
                "ihdhar@gmail.com",
                LocalDate.of(1999, Month.JANUARY, 25)
            );

            List<Student> myList = new ArrayList<>();
            myList.add(amal);
            myList.add(ihdhar);

        return myList;
    }
}
