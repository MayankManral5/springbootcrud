package com.example.demo.controller;


import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping({"/", ""})
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping({"/{studentId}"})
    public Student getStudentById(@PathVariable String studentId ){
        return studentService.getById(studentId);
    }

    @GetMapping({"/"})
    public List<Student> getAll( ){
        return studentService.getAll();
    }
}
