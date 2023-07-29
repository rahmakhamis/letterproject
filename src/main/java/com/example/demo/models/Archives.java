package com.example.demo.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "archives")

public class Archives {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="archives_id" )
    private Long id;
    private  String time;

   



}
