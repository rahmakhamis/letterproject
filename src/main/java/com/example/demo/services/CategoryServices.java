package com.example.demo.services;

import com.example.demo.models.Category;
import com.example.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
    @Autowired
    public CategoryRepository categoryRepo;
    public Category addCategory(Category s) {
        return  categoryRepo.save(s);
    }

    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryRepo.findById(id);
    }

    public void deleteById(Long id) {
        categoryRepo.deleteById(id);
    }
}
