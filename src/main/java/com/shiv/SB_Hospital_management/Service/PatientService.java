package com.shiv.SB_Hospital_management.Service;

import com.shiv.SB_Hospital_management.model.Patient;
import com.shiv.SB_Hospital_management.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    PatientRepo patientRepo;
    public ResponseEntity<String> addPatient(Patient patient) {
        patientRepo.save(patient);

        return new ResponseEntity<>("patient added successfully", HttpStatus.ACCEPTED);
    }
}
