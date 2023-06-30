package com.shiv.SB_Hospital_management.Service;

import com.shiv.SB_Hospital_management.model.Doctor;
import com.shiv.SB_Hospital_management.model.Symptom;
import com.shiv.SB_Hospital_management.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepo doctorRepo;
    public ResponseEntity<String> addDoctor(Doctor doctor) {
        doctorRepo.save(doctor);

        return new ResponseEntity<>("doctor added successfully!", HttpStatus.CREATED);
    }

    public List<Doctor> getAllDocs() {
        return doctorRepo.findAll();
    }

    public List<Doctor> getAllDoctors(Symptom symptom) {
       return doctorRepo.findBySpeciality(symptom);
    }
}
