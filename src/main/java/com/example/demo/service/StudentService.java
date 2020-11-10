package com.example.demo.service;

import com.example.demo.domain.Student;

import java.util.List;

public interface StudentService {

    public Student createStudent(Student student);

    public Student getById(String studentId);

    public List<Student> getAll();

    public void deleteStudent(String studentId);

    public Student updateStudent(Student student);


}
