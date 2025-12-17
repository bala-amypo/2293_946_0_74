package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Student;

public interface StudentServices{
    
    Student createData(Student stu);
    List<Student> fetchRecord();
    
}