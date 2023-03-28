package com.example.demo.services;

import com.example.demo.models.Application;
import com.example.demo.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServices {
    @Autowired
    private ApplicationRepository applicationRepo;



    public Application addApplication(Application s) {
        return applicationRepo.save(s);
    }

    public List<Application> getAll() {
        return applicationRepo.findAll();
    }

    public Optional<Application> findById(Long id) {
        return applicationRepo.findById(id);
    }

    public void deleteById(Long id) {
        applicationRepo.deleteById(id);
    }
}
