package com.example.demo.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
//    @ManyToOne
//    private Notification notification;


}
