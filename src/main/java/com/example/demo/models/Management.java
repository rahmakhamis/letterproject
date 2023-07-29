package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "management")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Management {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "management_id")
    private  Long id;
    private  String name;
    private  String password;
    private String status;
    private  String role;
}
