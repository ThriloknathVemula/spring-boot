package com.example.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{
    public ArrayList<Student> getStudents();
    public Student addStudent(Student student);
}
