package com.example.demo.controllers;

import com.example.demo.models.Archives;
import com.example.demo.services.ArchivesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/archives")

public class ArchivesController {
    @Autowired
    public ArchivesServices archivesService;

    @PostMapping("/archives")
    public Archives addarchives(@RequestBody Archives s){
        return archivesService.addArchives (s);
    }
    @GetMapping("/archives")
    public List<Archives> getAll() {
        return archivesService.getAll();
    }
    @GetMapping("/archives/{id}")
    public Optional<Archives> getById(@PathVariable Long id){
        return archivesService.findById(id);

    }
    @PutMapping("/archives/{id}")
    public  Archives updateArchives(@RequestBody Archives s, @PathVariable Long id){
        s.setId(id);
        return archivesService.addArchives(s);

    }
    @DeleteMapping("archives/{id}")
    public  void deleteMe(@PathVariable Long id){
        archivesService.deleteById(id);
    }

}


