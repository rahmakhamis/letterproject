package com.example.demo.services;

import com.example.demo.models.Faq;
import com.example.demo.repositories.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FaqServices {
    @Autowired
    private FaqRepository faqRepo;
    public Faq addFaq(Faq s) {
        return  faqRepo.save(s);
    }

    public List<Faq> getAll() {
        return faqRepo.findAll();
    }

    public Optional<Faq> findById(Long id) {
        return faqRepo.findById(id);
    }

    public void deleteById(Long id) {
       faqRepo.deleteById(id);
    }
}
