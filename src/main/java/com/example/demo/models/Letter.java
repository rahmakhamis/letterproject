package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "letter")
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "letter_id")
    private  Long Id;
    private  String letterTo;
    @Column(columnDefinition="text", length=10485760)
    private  String letterDoc;
    private  String status;
    private  String kk;
    private  String rejectedDocReason;
    private  String rejectedReason;

    @ManyToOne
    private  User letterFrom;

    @ManyToOne
    private  User rejectedBy;
}
