package com.example.demo.services;

import com.example.demo.models.Letter;
import com.example.demo.repositories.LetterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LetterServices {
    @Autowired
    private LetterRepository letterRepo;
    public Letter addLetter(Letter s) {
        return  letterRepo. save(s);
    }

    public List<Letter> getAll() {
        return letterRepo.findAll();
    }

    public Optional<Letter> findById(Long id) {
        return letterRepo.findById(id);
    }


    public void deleteById(Long id) {
        letterRepo.deleteById(id);
    }
}
