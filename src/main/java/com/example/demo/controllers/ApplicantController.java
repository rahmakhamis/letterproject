package com.example.demo.controllers;

import com.example.demo.models.Applicant;
import com.example.demo.services.ApplicantServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/applicant")

public class ApplicantController {
    @Autowired
    private ApplicantServices applicantService;

    @PostMapping("/")
public Applicant addApplicant(@RequestBody Applicant s){

        return applicantService.addApplicant (s);
    }

    @GetMapping("/")
    public List<Applicant> getAll(){
        return applicantService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Applicant> getById(@PathVariable Long id){
        return applicantService.findById(id);

    }

    @PutMapping("/{id}")
    public  Applicant updateApplicant(@RequestBody Applicant s, @PathVariable Long id){
        s.setId(id);
        return applicantService.addApplicant(s);

    }

@DeleteMapping("/{id}")
    public  void deleteMe(@PathVariable Long id){
        applicantService.deleteById(id);
}




}
