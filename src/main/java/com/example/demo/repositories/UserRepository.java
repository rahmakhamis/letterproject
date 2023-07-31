package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.rmi.registry.Registry;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select s from User s where email = ?1 and password= ?2")
    User findUsernameAndUserpassword(String username , String password);

    List<User> findUserByStatus(String status);

    @Query("select s from User s where id = ?1")
    User findUserUsingId(Long id);

}
