package com.example.demo.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "userrr")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="user_id" )
    private Long id;
    private String name;
    private  String email;
    private  String phoneNo;
    private  String role;
    private  String password;
    private  String gender;
    private String status;
//    @ManyToOne
//    private Notification notification;


}
