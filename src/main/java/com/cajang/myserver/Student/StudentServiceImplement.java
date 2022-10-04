package com.cajang.myserver.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplement implements StudentService {

    @Override
    public List<Student> getAllStudent() {
        Student amal = new Student(
                1L,
                "Ichlasul Amal",
                "amal@mitrasolusi.group",
                LocalDate.of(2000, Month.JANUARY, 5),
                22);

        Student naura = new Student(
                1L,
                "Naura Azizah",
                "naura@mitrasolusi.group",
                LocalDate.of(2000, Month.JANUARY, 5),
                22);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(amal);
        listStudent.add(naura);
        return listStudent;
    }

}
