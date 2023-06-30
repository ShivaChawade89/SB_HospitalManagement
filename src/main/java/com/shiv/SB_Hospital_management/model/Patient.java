package com.shiv.SB_Hospital_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min = 3)
    private String name;
    @Size(min = 20)
    private String city;
    @Email
    private String email;
    @Size(min = 10)
    private String number ;
    private Symptom symptom;


}
