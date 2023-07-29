package com.example.demo.repositories;

import com.example.demo.models.Archives;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchivesRepository extends JpaRepository<Archives, Long> {
}
