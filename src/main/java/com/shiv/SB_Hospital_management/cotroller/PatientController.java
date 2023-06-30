package com.shiv.SB_Hospital_management.cotroller;

import com.shiv.SB_Hospital_management.Service.DoctorService;
import com.shiv.SB_Hospital_management.Service.PatientService;
import com.shiv.SB_Hospital_management.model.Doctor;
import com.shiv.SB_Hospital_management.model.Patient;
import com.shiv.SB_Hospital_management.model.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    DoctorService doctorService;
    @PostMapping("addPatient")
    public ResponseEntity<String> addPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }

    @GetMapping("getAllDoctors/{symptom}")
    public List<Doctor> getDoctors(@PathVariable Symptom symptom){
        return  doctorService.getAllDoctors(symptom);
    }
}
