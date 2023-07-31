package com.example.demo.repositories;

import com.example.demo.models.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LetterRepository extends JpaRepository<Letter,Long> {
    @Query("select s from Letter s where id = ?1")
    Letter findLetterUsingId(Long id);

    List<Letter> findLetterByStatus(String status);

    List<Letter> findLetterByLetterTo(String letterTo);

    List<Letter> findLetterByKk(String kk);
}
