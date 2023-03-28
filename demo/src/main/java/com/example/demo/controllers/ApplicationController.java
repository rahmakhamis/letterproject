package com.example.demo.controllers;

import com.example.demo.models.Application;
import com.example.demo.services.ApplicationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping
public class ApplicationController {
    @Autowired
    public ApplicationServices applicationService;

    @PostMapping("/")
    public Application addApplication (@RequestBody Application s){
        return applicationService.addApplication (s);

    }

    @GetMapping("/")
    public List<Application> getAll(){
        return applicationService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Application> getById(@PathVariable Long id){
        return applicationService.findById(id);
    }

    @PutMapping("/{id}")
    public Application updateApplication(@RequestBody Application s, @PathVariable Long id){
        s.setId(id);
        return applicationService.addApplication(s);
    }

    @DeleteMapping("/{id}")
    public void deleteMe(@PathVariable Long id){
        applicationService.deleteById(id);
    }

}
