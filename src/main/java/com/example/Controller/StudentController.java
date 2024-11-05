package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Student;
import com.example.Services.StudentService;

@RestController
public class StudentController {

    @Autowired
    public StudentService service;

    @GetMapping("/")
    public String home(){
        return "Hello world";
    }


    @GetMapping("/students")
    public List<Student> getStudents(){
        System.out.println("getStudents");
        return service.getStudents();
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }
}
