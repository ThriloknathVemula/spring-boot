package com.example.Services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Student;
import com.example.Repository.StudentRepo;

@Service
public class StudentService implements StudentRepo{

    @Autowired
    private StudentRepo repo;

    @Override
    public ArrayList<Student> getStudents(){
        List<Student> studentList = repo.findAll();
        ArrayList<Student> students = new ArrayList<>(studentList);
        return students;
    }

    @Override
    public Student addStudent(Student student) {
       repo.save(student);
       return student;
    }
}
