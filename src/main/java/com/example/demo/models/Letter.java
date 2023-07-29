package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Letter")
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="letter_id")
    private Long id;
    private String from;
    private String to;
    private String letterDoc;
    private String status;
    private String KK;
    private String responseDocReason;
    private String reason;
    private String RejectedBy;
    private String rejectedReason;
//
//@ManyToOne
//    private User rejectedBy;
}
