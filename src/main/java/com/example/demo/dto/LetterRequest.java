package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LetterRequest {
    private  Long Id;
    private  String letterTo;
    private  String letterDoc;
    private  String status;
    private  String kk;
    private  String rejectedDocReason;
    private  String rejectedReason;
    private Long rejectedById;
    private Long letterFromId;
}
