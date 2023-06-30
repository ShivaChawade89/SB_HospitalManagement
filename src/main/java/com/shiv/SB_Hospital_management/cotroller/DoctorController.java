package com.shiv.SB_Hospital_management.cotroller;

import com.shiv.SB_Hospital_management.Service.DoctorService;
import com.shiv.SB_Hospital_management.model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @PostMapping("addDoctor")
    public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @GetMapping("getAllDoctors")
    public List<Doctor> getAllDoctors(){
       return doctorService.getAllDocs();
    }
}
