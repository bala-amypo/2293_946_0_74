package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.StudentServices;
import com.example.demo.entity.Student;

@RestController
public class StudentController {

    @Autowired
    StudentServices ser;

    @PostMapping("/adddata")
    public Student createData(@RequestBody Student stu){
        return ser.createData(stu);
    }
    @GetMapping("/fetch_data")
    public List<Student>   
}
}