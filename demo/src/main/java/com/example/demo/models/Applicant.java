package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applicant")

public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="applicant_id" )
    private Long id;
    private String name;
    private  String email;
    private  String phoneNo;
    private  String role;
    private  String gender;
    private String status;


}
