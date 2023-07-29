package com.example.demo.services;

import com.example.demo.models.Archives;
import com.example.demo.repositories.ArchivesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArchivesServices {
    @Autowired
    private ArchivesRepository archivesRepo;
    public Archives addArchives(Archives s) {
        return archivesRepo.save(s);
    }

    public List<Archives> getAll() {
        return  archivesRepo.findAll();
    }

    public Optional<Archives> findById(Long id) {
        return  archivesRepo.findById(id);
    }

    public void deleteById(Long id) {

           archivesRepo.deleteById(id);

    }
}
