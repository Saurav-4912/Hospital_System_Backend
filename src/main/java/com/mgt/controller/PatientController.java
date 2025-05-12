package com.mgt.controller;

import com.mgt.jwtServices.JwtService;
import com.mgt.model.Patient;
import com.mgt.model.User;
import com.mgt.repository.PatientRepo;
import com.mgt.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PatientController {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepo userRepo;

    @PostMapping("/addPatient")
    public Patient add(@RequestBody Patient patient , @RequestHeader("Authorization") String authHeader){
        String token = authHeader.substring(7);

        Long userId = jwtService.extractUserId(token);
        //Optional<User> user = userRepo.findByUserId(userId);
        //patient.setUser(user);

        return patientRepo.save(patient);

    }

    @GetMapping("/getListPatient")
    public List<Patient> getAllPatient(){
        return patientRepo.findAll();
    }



}
