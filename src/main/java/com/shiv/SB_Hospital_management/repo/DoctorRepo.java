package com.shiv.SB_Hospital_management.repo;

import com.shiv.SB_Hospital_management.model.Doctor;
import com.shiv.SB_Hospital_management.model.Symptom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepo extends JpaRepository<Doctor,Integer> {


    List<Doctor> findBySpeciality(Symptom symptom);
}
