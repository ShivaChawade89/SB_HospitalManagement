package com.shiv.SB_Hospital_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private City city;
    private String number;
    private String email;
    private Symptom speciality;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Patient> patients;


}
