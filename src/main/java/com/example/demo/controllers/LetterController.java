package com.example.demo.controllers;


import com.example.demo.models.Letter;

import com.example.demo.services.LetterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/letter")


public class LetterController {
    @Autowired
    public LetterServices letterService;
    @PostMapping("/")
    public Letter addLetter(@RequestBody Letter s){
        return letterService.addLetter (s);
    }
    @GetMapping("/")
    public List<Letter> getAll(){
        return letterService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Letter> getById(@PathVariable Long id){
        return letterService.findById(id);

    }

    @PutMapping("/{id}")
    public Letter updateLetter(@RequestBody Letter s, @PathVariable Long id){
        s.setId(id);
        return letterService.addLetter(s);

    }
    @DeleteMapping("/letter{id}")
    public  void deleteMe(@PathVariable Long id){
        letterService.deleteById(id);
    }


}
