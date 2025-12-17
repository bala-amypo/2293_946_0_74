package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentServices{
    
    public Student createData(Student stu);
    public List<Student> fetchRecord();
}