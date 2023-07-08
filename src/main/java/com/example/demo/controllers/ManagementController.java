package com.example.demo.controllers;

import com.example.demo.models.Management;
import com.example.demo.services.ManagementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/management")


public class ManagementController {
    @Autowired
    public ManagementServices managementService;
    @PostMapping("/manage")
    public Management addManagement(@RequestBody Management s){
        return managementService.addManagement(s);

    }
    @GetMapping("/manage")
    public List<Management>getAll(){
        return  managementService.getAll();
    }
    @GetMapping("/manage/{id}")
    public Optional<Management>getById(@PathVariable Long id){
        return managementService.findById(id);
    }
    @PutMapping("/manage/{id}")
    public Management updateManagement(@RequestBody Management s, @PathVariable Long id){
        s.setId(id);
        return  managementService.addManagement(s);
    }
    @DeleteMapping("/manage/{id}")
    public void  deleteMe(@PathVariable Long id){
        managementService.deleteById(id);

    }
}
