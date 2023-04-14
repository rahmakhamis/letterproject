package com.example.demo.services;

import com.example.demo.models.Applicant;
import com.example.demo.repositories.ApplicantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicantServices {
    @Autowired
    private ApplicantRepository applicantRepo;
    public Applicant addApplicant(Applicant s) {
        return  applicantRepo.save(s);
    }

    public List<Applicant> getAll() {
        return applicantRepo.findAll();
    }

    public Optional<Applicant> findById(Long id) {
        return  applicantRepo.findById(id);
    }

    public void deleteById(Long id) {
        applicantRepo.deleteById(id);
    }
}
