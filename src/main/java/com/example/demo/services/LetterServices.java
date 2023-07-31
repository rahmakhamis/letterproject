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
        return letterRepo.save(s);

    }

    public List<Letter> getAll() {
        return letterRepo.findAll();
    }

    public List<Letter> getAllByStatus(String status) {
        return letterRepo.findLetterByStatus(status);
    }

    public List<Letter> getAllBykk(String kk) {
        return letterRepo.findLetterByKk(kk);
    }

    public List<Letter> getAllLetterTo(String letterTo) {
        return letterRepo.findLetterByLetterTo(letterTo);
    }

    public Optional<Letter> findById(Long id) {
        return letterRepo.findById(id);
    }


    public void deleteById(Long id) {
        letterRepo.deleteById(id);
    }
}
