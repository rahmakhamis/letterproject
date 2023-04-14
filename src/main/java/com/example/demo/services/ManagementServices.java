package com.example.demo.services;

import com.example.demo.models.Management;
import com.example.demo.repositories.ManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ManagementServices {
    @Autowired
    public ManagementRepository managementRepo;
    public Management addManagement(Management s) {
        return managementRepo.save(s);
    }


    public List<Management> getAll() {
        return managementRepo.findAll();
    }

    public Optional<Management> findById(Long id) {
        return managementRepo.findById(id);
    }

    public void deleteById(Long id) {
        managementRepo.deleteById(id);
    }
}
