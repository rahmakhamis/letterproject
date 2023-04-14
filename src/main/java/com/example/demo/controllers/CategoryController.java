package com.example.demo.controllers;

import com.example.demo.models.Category;

import com.example.demo.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("api/category")

public class CategoryController {
    @Autowired
    public CategoryServices categoryService;

    @PostMapping("/")
    public Category addCategory(@RequestBody Category s){
        return  categoryService.addCategory(s);
    }
    @PutMapping("/{id}")
    public  Category updateCategory(@RequestBody Category s, @PathVariable Long id){
        s.setId(id);
        return categoryService.addCategory(s);
    }
    @GetMapping("/")
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Category> getById(@PathVariable Long id){
        return categoryService.findById(id);
    }
    @DeleteMapping("/{id}")
    public  void deleteMe(@PathVariable Long id){
        categoryService.deleteById(id);
    }


    }
