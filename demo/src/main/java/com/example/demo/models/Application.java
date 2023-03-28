package com.example.demo.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "application")

public class Application {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "application_id")
    private Long id;
    private String status;
    private String priority;
    private  String subject;


}
