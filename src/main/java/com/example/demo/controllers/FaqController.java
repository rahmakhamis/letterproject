package com.example.demo.controllers;

import com.example.demo.models.Applicant;
import com.example.demo.models.Faq;
import com.example.demo.services.ApplicantServices;
import com.example.demo.services.FaqServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/faq")
public class FaqController {
    @Autowired
    private FaqServices faqService;

    @PostMapping("/faq")
    public Faq addFaq(@RequestBody Faq s){

        return faqService.addFaq (s);
    }

    @GetMapping("/faq")
    public List<Faq> getAll(){
        return faqService.getAll();
    }
    @GetMapping("/faq/{id}")
    public Optional<Faq> getById(@PathVariable Long id){
        return faqService.findById(id);

    }
    @PutMapping("/faq/{id}")
    public  Faq updateFaq (@RequestBody Faq s, @PathVariable Long id){
        s.setId(id);
        return faqService.addFaq(s);

    }
    @DeleteMapping("/faq/{id}")
    public  void deleteMe(@PathVariable Long id){
       faqService.deleteById(id);
    }



}
