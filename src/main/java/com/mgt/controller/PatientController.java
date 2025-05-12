
package com.mgt.controller;


import com.mgt.model.Patient;
import com.mgt.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientController
{
    @Autowired
    private PatientService patientService;

    @PostMapping("/addPatient")
    public Patient savePatient(@RequestBody Patient patient)
    {
        Patient newPatient = patientService.addPatient(patient);

        if(patient!=null)
            return newPatient;
        else
            return null;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return "Patient with ID " + id + " has been deleted.";
    }
}
