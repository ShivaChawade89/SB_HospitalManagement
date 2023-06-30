package com.shiv.SB_Hospital_management.repo;

import com.shiv.SB_Hospital_management.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
