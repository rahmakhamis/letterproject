package com.example.demo.services;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServices {
    @Autowired
    private StudentRepository studentRepo;
    public Student addStudent(Student s)
    {
        return studentRepo.save(s);
    }


    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Optional<Student> findById(Long id) {
        return studentRepo.findById(id);
    }

    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }
}
